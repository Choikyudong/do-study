package designpattern.structural;

import java.io.File;

public class Facade {

	public static void main(String[] args) {
		FacadePattern pattern = new FacadePattern();
		File mp4 = pattern.convertVideo("this.mp4", "mp4");
	}

}

/* 라이브러리 */
class VideoFile {
	private final String name;
	private final String codecType;

	public VideoFile(String name) {
		this.name = name;
		this.codecType = name.substring(name.indexOf(".") + 1);;
	}

	public String getName() {
		return name;
	}

	public String getCodecType() {
		return codecType;
	}
}

interface Codec {}

class MPEG4Codec implements Codec {
	public final String TYPE = "mp4";
}

class OggCodec implements Codec {
	public final String TYPE = "ogg";
}

class CodecFactory {
	public static Codec extract(VideoFile file) {
		String type = file.getCodecType();
		if (type.equals("mp4")) {
			System.out.println("CodecFactory: extracting mpeg audio...");
			return new MPEG4Codec();
		} else {
			System.out.println("CodecFactory: extracting ogg audio...");
			return new OggCodec();
		}
	}
}

class BitracteReader {
	public static VideoFile read(VideoFile file, Codec codec) {
		System.out.println("BitrateReader: reading file...");
		return file;
	}

	public static VideoFile convert(VideoFile buffer, Codec codec) {
		System.out.println("BitrateReader: writing file...");
		return buffer;
	}
}

class AudioMixer {
	public File fix(VideoFile result){
		System.out.println("AudioMixer: fixing audio...");
		return new File("tmp");
	}
}
/* 라이브러리 끝 */

/* 서비스 로직 */
class FacadePattern {
	public File convertVideo(String fileName, String format) {
		System.out.println("FacadePattern: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);
		Codec destinationCodec;
		if (format.equals("mp4")) {
			destinationCodec = new MPEG4Codec();
		} else {
			destinationCodec = new OggCodec();
		}
		VideoFile buffer = BitracteReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitracteReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("FacadePattern: conversion completed.");
		return result;
	}
}
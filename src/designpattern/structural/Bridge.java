package designpattern.structural;

public class Bridge {

	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		basicRemote.channelUp();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		advancedRemote.volumeDown();
		device.printStatus();
	}

}

interface Device {
	boolean isEnabled();

	void enabled();

	void disable();

	int getVolume();

	void setVolume(int percent);

	int getChannel();

	void setChannel(int channel);

	void printStatus();
}

class Radio implements Device {
	private boolean onDevice = false;
	private int volume = 10;
	private int channel = 1;

	@Override
	public boolean isEnabled() {
		return onDevice;
	}

	@Override
	public void enabled() {
		onDevice = true;
	}

	@Override
	public void disable() {
		onDevice = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else {
			this.volume = Math.max(volume, 0);
		}
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
		System.out.println("| I'm radio.");
		System.out.println("| I'm " + (onDevice ? "enabled" : "disabled"));
		System.out.println("| Current volume is " + volume + "%");
		System.out.println("| Current channel is " + channel);
		System.out.println("------------------------------------\n");
	}
}

class Tv implements Device {
	private boolean onDevice = false;
	private int volume = 10;
	private int channel = 1;

	@Override
	public boolean isEnabled() {
		return onDevice;
	}

	@Override
	public void enabled() {
		onDevice = true;
	}

	@Override
	public void disable() {
		onDevice = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else {
			this.volume = Math.max(volume, 0);
		}
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
		System.out.println("| I'm TV set.");
		System.out.println("| I'm " + (onDevice ? "enabled" : "disabled"));
		System.out.println("| Current volume is " + volume + "%");
		System.out.println("| Current channel is " + channel);
		System.out.println("------------------------------------\n");
	}
}

interface Remote {
	void power();

	void volumeUp();

	void volumeDown();

	void channelUp();

	void channelDown();
}

class BasicRemote implements Remote {
	protected Device device;

	public BasicRemote() {}

	public BasicRemote(Device device) {
		this.device = device;
	}

	@Override
	public void power() {
		System.out.println("Remote: power toggle");
		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enabled();
		}
	}

	@Override
	public void volumeDown() {
		System.out.println("Remote: volume down");
		device.setVolume(device.getVolume() - 10);
	}

	@Override
	public void volumeUp() {
		System.out.println("Remote: volume up");
		device.setVolume(device.getVolume() + 10);
	}

	@Override
	public void channelDown() {
		System.out.println("Remote: channel down");
		device.setChannel(device.getChannel() - 1);
	}

	@Override
	public void channelUp() {
		System.out.println("Remote: channel up");
		device.setChannel(device.getChannel() + 1);
	}
}

class AdvancedRemote extends BasicRemote {
	public AdvancedRemote(Device device) {
		super.device = device;
	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}

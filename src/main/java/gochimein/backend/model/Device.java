package gochimein.backend.model;

import javax.persistence.Entity;

@Entity
public class Device extends BaseModel{

	private String hardware;

	private String os;

	public String getHardware() {
		return hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

}

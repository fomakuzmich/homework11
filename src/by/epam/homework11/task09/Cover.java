package by.epam.homework11.task09;

import java.io.Serializable;
import java.util.Objects;

public class Cover implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean hardOrSoft;
	private String blinding;
	
	public Cover(boolean hardOrSoft) {
		this.hardOrSoft = hardOrSoft;
		this.setBlinding(hardOrSoft);
	}
	
	public Cover() {
		this.hardOrSoft = false;
		this.setBlinding(hardOrSoft);
	}

	public void setHardOrSoft(boolean hardOrSoft) {
		this.hardOrSoft = hardOrSoft;
	}
	
	private void setBlinding(boolean hardOrSoft) {
		if (hardOrSoft) {
			this.blinding = "Hard cover";
		}
		else {
			this.blinding = "Soft cover";
		}
	}

	public String getBlinding() {
		return blinding;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(blinding, hardOrSoft);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cover other = (Cover) obj;
		return Objects.equals(blinding, other.blinding) && hardOrSoft == other.hardOrSoft;
	}

	@Override
	public String toString() {
		return "Cover [hardOrSoft=" + hardOrSoft + ", blinding=" + blinding + "]";
	}
	
	
	
	
	
	
	

}

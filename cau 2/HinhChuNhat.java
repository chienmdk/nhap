package bailuyentap5.cau2;

public class HinhChuNhat extends HinhHoc {
	public float cd,cr;
	public void HinhChuNhat(float cd,float cr) {
		this.cd=cd;
		this.cr=cr;
	}
	public void HinhChuNhat() {
		
	}

	public float getCd() {
		return cd;
	}

	public void setCd(float cd) {
		this.cd = cd;
	}

	public float getCr() {
		return cr;
	}

	public void setCr(float cr) {
		this.cr = cr;
	}

	@Override
	public String toString() {
		return "HinhChuNhat [cd=" + cd + ", cr=" + cr + "]";
	}
	public double dienTich() {
		return (cd+cr)*2;		
	}
}


package test;

public class Homework_Unit4_1 {

		//Xây dựng lớp Xe với các thuộc tính TenXe, LoaiXe, VanTocMax
				private String TenXe, LoaiXe;
				private int VanToc;

				public Homework_Unit4_1() {

				}

				public Homework_Unit4_1(String TenXe, String LoaiXe, int VanToc) {
					this.TenXe = TenXe;
					this.LoaiXe = LoaiXe;
					this.VanToc = VanToc;
				}

				public String getTenXe() {
					return TenXe;
				}

				public void setTenXe(String tenXe) {
					this.TenXe = tenXe;
				}

				public String getLoaiXe() {
					return LoaiXe;
				}

				public void setLoaiXe(String loaiXe) {
					this.LoaiXe = loaiXe;
				}

				public int getVanToc() {
					return VanToc;
				}

				public void setVanToc(int vanToc) {
					this.VanToc = vanToc;

	}

}

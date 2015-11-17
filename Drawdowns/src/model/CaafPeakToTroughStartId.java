package model;

// Generated Nov 16, 2015 2:20:09 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CaafPeakToTroughStartId generated by hbm2java
 */
@Embeddable
public class CaafPeakToTroughStartId implements java.io.Serializable {

	private Integer permno;
	private Integer yrmo;
	private Date value1;
	private String value2;
	private String value3;
	private String value6;
	private String value24;

	public CaafPeakToTroughStartId() {
	}

	public CaafPeakToTroughStartId(Integer permno, Integer yrmo, Date value1,
			String value2, String value3, String value6, String value24) {
		this.permno = permno;
		this.yrmo = yrmo;
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.value6 = value6;
		this.value24 = value24;
	}

	@Column(name = "permno")
	public Integer getPermno() {
		return this.permno;
	}

	public void setPermno(Integer permno) {
		this.permno = permno;
	}

	@Column(name = "yrmo")
	public Integer getYrmo() {
		return this.yrmo;
	}

	public void setYrmo(Integer yrmo) {
		this.yrmo = yrmo;
	}

	@Column(name = "value1", length = 10)
	public Date getValue1() {
		return this.value1;
	}

	public void setValue1(Date value1) {
		this.value1 = value1;
	}

	@Column(name = "value2", length = 10)
	public String getValue2() {
		return this.value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	@Column(name = "value3", length = 10)
	public String getValue3() {
		return this.value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}

	@Column(name = "value6", length = 10)
	public String getValue6() {
		return this.value6;
	}

	public void setValue6(String value6) {
		this.value6 = value6;
	}

	@Column(name = "value24", length = 10)
	public String getValue24() {
		return this.value24;
	}

	public void setValue24(String value24) {
		this.value24 = value24;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CaafPeakToTroughStartId))
			return false;
		CaafPeakToTroughStartId castOther = (CaafPeakToTroughStartId) other;

		return ((this.getPermno() == castOther.getPermno()) || (this
				.getPermno() != null && castOther.getPermno() != null && this
				.getPermno().equals(castOther.getPermno())))
				&& ((this.getYrmo() == castOther.getYrmo()) || (this.getYrmo() != null
						&& castOther.getYrmo() != null && this.getYrmo()
						.equals(castOther.getYrmo())))
				&& ((this.getValue1() == castOther.getValue1()) || (this
						.getValue1() != null && castOther.getValue1() != null && this
						.getValue1().equals(castOther.getValue1())))
				&& ((this.getValue2() == castOther.getValue2()) || (this
						.getValue2() != null && castOther.getValue2() != null && this
						.getValue2().equals(castOther.getValue2())))
				&& ((this.getValue3() == castOther.getValue3()) || (this
						.getValue3() != null && castOther.getValue3() != null && this
						.getValue3().equals(castOther.getValue3())))
				&& ((this.getValue6() == castOther.getValue6()) || (this
						.getValue6() != null && castOther.getValue6() != null && this
						.getValue6().equals(castOther.getValue6())))
				&& ((this.getValue24() == castOther.getValue24()) || (this
						.getValue24() != null && castOther.getValue24() != null && this
						.getValue24().equals(castOther.getValue24())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPermno() == null ? 0 : this.getPermno().hashCode());
		result = 37 * result
				+ (getYrmo() == null ? 0 : this.getYrmo().hashCode());
		result = 37 * result
				+ (getValue1() == null ? 0 : this.getValue1().hashCode());
		result = 37 * result
				+ (getValue2() == null ? 0 : this.getValue2().hashCode());
		result = 37 * result
				+ (getValue3() == null ? 0 : this.getValue3().hashCode());
		result = 37 * result
				+ (getValue6() == null ? 0 : this.getValue6().hashCode());
		result = 37 * result
				+ (getValue24() == null ? 0 : this.getValue24().hashCode());
		return result;
	}

}
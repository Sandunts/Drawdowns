package model;

// Generated Nov 16, 2015 2:20:09 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CapmPttStartDates generated by hbm2java
 */
@Entity
@Table(name = "capm_ptt_start_dates", catalog = "karsha_drawdowns")
public class CapmPttStartDates implements java.io.Serializable {

	private CapmPttStartDatesId id;

	public CapmPttStartDates() {
	}

	public CapmPttStartDates(CapmPttStartDatesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "permno", column = @Column(name = "PERMNO")),
			@AttributeOverride(name = "yrmo", column = @Column(name = "YRMO")),
			@AttributeOverride(name = "horizon", column = @Column(name = "HORIZON")),
			@AttributeOverride(name = "value0", column = @Column(name = "value0", length = 10)),
			@AttributeOverride(name = "value1", column = @Column(name = "value1", length = 10)),
			@AttributeOverride(name = "value2", column = @Column(name = "value2", length = 10)) })
	public CapmPttStartDatesId getId() {
		return this.id;
	}

	public void setId(CapmPttStartDatesId id) {
		this.id = id;
	}

}

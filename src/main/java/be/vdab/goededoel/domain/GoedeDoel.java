package be.vdab.goededoel.domain;

import java.math.BigDecimal;

public class GoedeDoel {
	private final String naam;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public BigDecimal getOpbrengst() {
		return opbrengst;
	}

	@Override
	public boolean equals(Object object) {
		return object instanceof GoedeDoel ander && naam.equalsIgnoreCase(ander.naam);
	}

	@Override
	public int hashCode() {
		return this.naam.toUpperCase().hashCode();
	}

}

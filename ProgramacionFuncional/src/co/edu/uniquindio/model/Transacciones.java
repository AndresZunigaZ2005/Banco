package co.edu.uniquindio.model;

import java.util.Calendar;
import java.util.Objects;

public class Transacciones {
	private double valor;
	private trader trader;
	private Calendar fecha;

	public Transacciones() {
		super();
	}
	public Transacciones(double valor, co.edu.uniquindio.model.trader trader, Calendar fecha) {
		super();
		this.valor = valor;
		this.trader = trader;
		this.fecha = fecha;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public trader getTrader() {
		return trader;
	}
	public void setTrader(trader trader) {
		this.trader = trader;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fecha, trader, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transacciones other = (Transacciones) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(trader, other.trader) && valor == other.valor;
	}
	public int getYear() {
		return fecha.get(Calendar.YEAR);
	}
	
}

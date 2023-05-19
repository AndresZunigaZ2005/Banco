package collection_stream;

import java.util.Calendar;
import java.util.Date;

public class Transaction {

	private Calendar calendar;
	private double value;
	private Trader trader;
	/**
	 * Constructor
	 * @param date
	 * @param value
	 */
	public Transaction(Calendar calendar, double value, Trader trader) {
		super();
		this.calendar = calendar;
		this.value = value;
		this.trader = trader;
	}
	public Calendar getCalendar() {
		return calendar;
	}
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	@Override
	public String toString() {
		return "Transaction [calendar=" + calendar + ", value=" + value + ", trader=" + trader + "]";
	}
	public int getCalendarYear() {
		return calendar.get(Calendar.YEAR);
	}
}

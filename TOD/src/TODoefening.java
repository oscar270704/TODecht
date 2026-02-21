

/**
 * elke instntie v deze klasse slaat een tijdstip op gegeven door een geheel aantal
 * uren tussen 0 en 23 en een geheel aantal minuten tussen 0 en 59
 * 
 * @invar | 0<= getHours() && getHours() <=23
 * @invar | 0<= getMinutes() && getMinutes() <= 59
 * 
 */
public class TODoefening{
	
	/** 1.2. De geldige concretetoestandsruimte definiëren
	 * @invar |0<= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 */
	private int hours;
	private int minutes;
	
	
	
	
	
	/* inspector **/
	public int getHours() 
		{return hours;} /* 1.3. De abstractierelatie definiëren*/

	/* inspector */
	public int getMinutes()
		{return minutes;} /* 1.3. De abstractierelatie definiëren*/
	
	/** constuctor 
	 * intitialiseert het object met het gegeven aantal uren en minuten
	 * je had dit ook met precondities kunnen doen ipv throws 
	 *@throws IllegalArgumentException
	 *		| hours < 0 || 23 < hours
	 *@throws IllegalArgumentException
	 *		| minutes < 0 || 59 < minutes
	 *
	 *
	 * @post |getHours() == hours
	 * @post | getMinutes() == minutes 
	 */
	public TODoefening(int hours, int minutes) {
		if (hours < 0 || 23 < hours) 
			throw new IllegalArgumentException("hours out of range");
		if (minutes < 0 || 59 < minutes)
			throw new IllegalArgumentException("minutes out of range");

		this.hours = hours;
		this.minutes = minutes;
	}
	
	/** mutator
	 * @pre |0<= hours && hours <= 23
	 * @mutates |this
	 * @post |getHours() == hours
	 * @post |getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) 
		{this.hours = hours;}

	/** mutator
	 * @pre | 0 <= minutes && minutes <= 59
	 * @mutates |this
	 * @post |getHours() == old(getHours())
	 * @post |getMinutes() == minutes
	 */
	public void setMinutes(int minutes) 
	{this.minutes = minutes;}








}
	
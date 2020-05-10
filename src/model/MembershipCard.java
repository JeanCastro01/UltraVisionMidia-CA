package model;

/**
 * this class is respensable for the membership( LoyaltyCard) points for the
 * customer
 * 
 * @author jeancastro
 */
public class MembershipCard {

	private int points;
	private int cardID;

	/**
	 * this constructor for membership card with points and cardID attributes
	 * 
	 * @param points
	 *            number of points for customer membershipcard
	 * @param cardID
	 *            customer id number
	 */

	public MembershipCard(int points, int cardID) {

		this.points = points;
		this.cardID = cardID;
	}

	/**
	 * this method return the membership points
	 * 
	 * @return memberships's points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * this method retunr the membership id
	 * 
	 * @return this membership's id
	 */

	public int getCardID() {
		return cardID;
	}

}

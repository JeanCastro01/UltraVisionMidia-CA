package model;

/**
 *
 * @author jeancastro
 */
public class MembershipCard {

	private int points;
	private int cardID;

	public MembershipCard(int points, int cardID) {

		this.points = points;
		this.cardID = cardID;
	}

	public int getPoints() {
		return points;
	}

	public int getCardID() {
		return cardID;
	}

}

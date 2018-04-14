package assignment6;// insert header here

import java.util.List;

public class Theater {
	/*
	 * Represents a seat in the theater
	 * A1, A2, A3, ... B1, B2, B3 ...
	 */
	static class Seat {
		private int rowNum;
		private int seatNum;

		public Seat(int rowNum, int seatNum) {
			this.rowNum = rowNum;
			this.seatNum = seatNum;
		}

		public int getSeatNum() {
			return seatNum;
		}

		public int getRowNum() {
			return rowNum;
		}

		@Override
		public String toString() {
			// TODO: Implement this method to return the full Seat location ex: A1
			// Recall that ASCII A is x41 and ASCII Z is 5A
			String rows = Integer.toString((getSeatNum()));


			return rows + Integer.toString(getRowNum());
		}
	}

  /*
	 * Represents a ticket purchased by a client
	 */
	static class Ticket {
		private String show;
		private String boxOfficeId;
		private Seat seat;
	  private int client;

		public Ticket(String show, String boxOfficeId, Seat seat, int client) {
			this.show = show;
			this.boxOfficeId = boxOfficeId;
			this.seat = seat;
			this.client = client;
		}

		public Seat getSeat() {
			return seat;
		}

		public String getShow() {
			return show;
		}

		public String getBoxOfficeId() {
			return boxOfficeId;
		}

		public int getClient() {
			return client;
		}

		@Override
		public String toString() {
			// TODO: Implement this method to return a string that resembles a ticket
			// print the ticket border
			System.out.println("-------------------------------\n");

			// print the Show name line
			System.out.print("| Show: " + getShow());
			int spaces = 31 - (8 + getShow().length()); // number of spaces we need to print out on the ticket
			for(int i = 0; i < spaces; i++){
				System.out.print(" ");
			}
			System.out.println("|");

			//print the Box Office ID line
			System.out.print("| Box Office ID: " + getBoxOfficeId());
			spaces = 31 - (17 + getBoxOfficeId().length());
			for(int i = 0; i < spaces; i++){
				System.out.print(" ");
			}
			System.out.println("|");

			//print the Seat line
			System.out.println(" Seat: " + getSeat());
			spaces = 31;
			return null;

		}
	}

	public Theater(int numRows, int seatsPerRow, String show) {
		// TODO: Implement this constructor
	}

	/*
	 * Calculates the best seat not yet reserved
	 *
 	 * @return the best seat or null if theater is full
   */
	public Seat bestAvailableSeat() {
		//TODO: Implement this method
		return null;
	}

	/*
	 * Prints a ticket for the client after they reserve a seat
   * Also prints the ticket to the console
	 *
   * @param seat a particular seat in the theater
   * @return a ticket or null if a box office failed to reserve the seat
   */
	public Ticket printTicket(String boxOfficeId, Seat seat, int client) {
		//TODO: Implement this method
		return null;
	}

	/*
	 * Lists all tickets sold for this theater in order of purchase
	 *
   * @return list of tickets sold
   */
	public List<Ticket> getTransactionLog() {
		//TODO: Implement this method
		return null;
	}
}

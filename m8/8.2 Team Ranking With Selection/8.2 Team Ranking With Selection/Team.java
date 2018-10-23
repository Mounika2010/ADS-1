class Team implements Comparable<Team> {
	String teamName;
	int wins;
	int losses;
	int draws;

	Team(String teamName, int wins, int losses, int draws) {
		this.teamName = teamName;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public int getWins() {
		return this.wins;
	}

	public int getLosses() {
		return this.losses;
	}

	public int getDraws() {
		return this.draws;
	}

	public void setTeamName() {
		this.teamName = teamName;
	}

	public void setWins() {
		this.wins = wins;
	}

	public void setLosses() {
		this.losses = losses;
	}

	public void setDraws() {
		this.draws = draws;
	}

	public String toString() {
		return this.teamName;		
	}

	public int compareTo(Team that) {
		if(this.wins > that.wins) return -1;
		if(this.wins < that.wins) return 1;
		if(this.losses < that.losses) return -1;
		if(this.losses > that.losses) return 1;
		if(this.draws > that.draws) return -1;
		if(this.draws < that.draws) return 1;
		return 0;
	}

}
 
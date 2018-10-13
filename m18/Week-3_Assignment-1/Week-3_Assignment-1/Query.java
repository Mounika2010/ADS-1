class Query {
	String get;
	double intersection;

	Query(String get, double intersection) {
		this.get = get;
		this.intersection = intersection;
	}

	public String getGet() {
		return this.get;
	}
	
	public double getIntersection() {
		return this.intersection;
	}

	public void setGet(String get) {
		return this.get;
	}

	public void setIntersection(double intersection) {
		return this.intersection;
	}
}
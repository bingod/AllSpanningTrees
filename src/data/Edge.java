package data;

public class Edge implements Comparable<Edge>{
	private Vertex v1,v2;

	public Edge(Vertex v1, Vertex v2) {
		super();
		Vertex min=v1.getNum()<v2.getNum()?v1:v2;
		Vertex max=v1.getNum()>v2.getNum()?v1:v2;
		this.v1 = min;
		this.v2 = max;
	}
	public Vertex getV1() {
		return v1;
	}
	public Vertex getV2() {
		return v2;
	}
	@Override
	public int compareTo(Edge o) {
		return v1.getNum()==o.v1.getNum()?v2.getNum()-o.v2.getNum():v1.getNum()-o.v1.getNum();		
	}
	@Override
	public int hashCode() {
		final int prime = 10241024;
		int result = 1;
		result = prime * result + ((v1 == null) ? 0 : v1.hashCode());
		result = prime * result + ((v2 == null) ? 0 : v2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if(v1.equals(other.v1))
			return v2.equals(other.v2);
		else
			if(v1.equals(other.v2))
				return v2.equals(other.v1);
			else
				return false;		
	}
	public String toString() {
		return "[" + v1 + "," + v2 + "]";
	}
	
}
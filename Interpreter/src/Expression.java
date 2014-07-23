public interface Expression {
	public boolean equals(Object obj);
	public int hashCode();
	public String toString();
	public boolean interpret(Context context);
}
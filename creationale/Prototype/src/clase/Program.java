package clase;

public class Program {
	public static void main(String[] args) {
	IClient client = new Client("Ioana", 20);
	IClient clientCopie = client.copiaza();
	System.out.println(client.toString());
	System.out.println(clientCopie.toString());
	}
}

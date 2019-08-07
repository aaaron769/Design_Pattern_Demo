import java.util.ArrayList;
import java.util.List;

public class Client {
	private ChainBuilder chain;

	public Client() {

		chain = new ChainBuilder();
	}

	public void sendRequest(List<String> templateTypes) {
		//imageHandeler
		chain.getHandler().handleRequest(templateTypes);
	}

	public static void main(String[] args) {
		List<String> templateTypes = new ArrayList<>();
		templateTypes.add("image");
		templateTypes.add("post");
		templateTypes.add("category");
		templateTypes.add("archive");
		//templateTypes.add("frontpage");
		Client client = new Client();
		client.sendRequest(templateTypes);
		// for image
		List<String> templateTypes2 = new ArrayList<>();
		templateTypes2.add("image");

		client.sendRequest(templateTypes2);
	}
}

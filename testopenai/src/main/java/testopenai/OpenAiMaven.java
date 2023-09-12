package testopenai;

import com.theokanning.openai.OpenAiHttpException;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class OpenAiMaven {
	public static void main(String[] args) {
		
		final String apiKey = "Your Get OpenAI API key";
		final OpenAiService srv = new OpenAiService(apiKey);
		
		String prompt = "How do you WednesDay?";
		
		try{
			CompletionRequest compReq = CompletionRequest.builder()
				.prompt(prompt)
				.model("gpt-3.5-turbo")
				.echo(true)
				.maxTokens(100)
				.temperature(0.0)
				.build();
			srv.createCompletion(compReq).getChoices().forEach(System.out::println);

		} catch(OpenAiHttpException e) {
			System.out.println("This Connected Error OpenAI Service");
		}
		
		
	}
}

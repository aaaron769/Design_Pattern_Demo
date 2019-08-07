public class ChainBuilder {
	private TemplateHandler handler;

	// other necessary code here
	private void buildChain() {
		TemplateHandler imageTemplate = new ImageTemplate();
		TemplateHandler singleTemplate = new SingleTemplate();
		TemplateHandler categoryTemplate = new CategoryTemplate();
		TemplateHandler archiveTemplate = new ArchiveTemplate();
		TemplateHandler genericTemplate = new GenericTemplate();
		// linking
		imageTemplate.nextTemplate = singleTemplate;//it's next template is singleTemplate

		singleTemplate.nextTemplate = categoryTemplate;
		categoryTemplate.nextTemplate = archiveTemplate;
		archiveTemplate.nextTemplate = genericTemplate;
		// our image template will be the basic starter template
		handler = imageTemplate;
	}

	public TemplateHandler getHandler() {
		buildChain();
		return handler;
	}
}

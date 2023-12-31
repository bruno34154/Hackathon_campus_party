// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativemobileresources.proxies;

public enum InAppBrowserDismissButtonStyle
{
	done(new java.lang.String[][] { new java.lang.String[] { "en_US", "Done" }, new java.lang.String[] { "pt_BR", "Done" } }),
	close(new java.lang.String[][] { new java.lang.String[] { "en_US", "Close" }, new java.lang.String[] { "pt_BR", "Close" } }),
	cancel(new java.lang.String[][] { new java.lang.String[] { "en_US", "Cancel" }, new java.lang.String[] { "pt_BR", "Cancel" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private InAppBrowserDismissButtonStyle(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "pt_BR");
	}

	public java.lang.String getCaption()
	{
		return captions.get("pt_BR");
	}
}

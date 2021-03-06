package DTO;

import View.XmlWrapper;

/**
 * Get String parametrs template name and resolution
 * 
 * @author yaroslav
 * 
 */
public class HNameDpi implements Handler {

	@Override
	public void execute(XmlWrapper wr, ImageParametrs ip) {
		ip.setNewName(wr.getTxtName().getText());
		// if need to check if empty set "" or default
		ip.setResolutionDPI(wr.getTxtDPI().getText());
	}

}

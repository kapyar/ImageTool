package DataStrategy;

import DTO.HColorModel;
import DTO.HExtended;
import DTO.HManualSize;
import DTO.HNameDpi;
import DTO.HThumbnail;
import DTO.HandleManager;
import DTO.ImageParametrs;
import View.XmlWrapper;

/**
 * Save data to {@link ImageParametrs} object strategy and write into xml file
 * 
 */
public class HoldDataStrategy extends Strategy {

	@Override
	public void execute(XmlWrapper wr) {
		HandleManager manager = new HandleManager();

		// register elements of chain
		manager.registerHandler(new HColorModel());
		manager.registerHandler(new HExtended());
		manager.registerHandler(new HManualSize());
		manager.registerHandler(new HNameDpi());
		manager.registerHandler(new HThumbnail());

		super.setImage(manager.getImageParamets(wr));

		Model.Model.GET.doSaveXmlFile(super.getImage());

	}// END execute

}

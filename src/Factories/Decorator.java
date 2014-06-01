package Factories;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import View.Config;

public class Decorator {

	/** FontType uses in Titles */
	public static final String FontType = "Segoe UI";
	private static final String ConfigColor = null;
	private static final int H1 = 21;

	public static void decorateTitle(JLabel label) {

		label.setFont(new Font(FontType, Font.PLAIN, H1));

		label.setAlignmentX(label.CENTER_ALIGNMENT);
		label.setLocation(Config.WIDTH_MAIN / 2 - label.getWidth() / 2, 26);

	}

	/**
	 * 
	 * @param label
	 *            all info about statement which user need to know
	 */
	public static void decorateNormal(JLabel label) {

		label.setFont(new Font(FontType, Font.ROMAN_BASELINE, 15));

	}

	/**
	 * 
	 * @param l
	 *            JLabel which we need to decorate using it only in compared
	 *            panels
	 */
	public static void decorateInfo(Component l) {
		l.setFont(new Font(FontType, Font.PLAIN, 11));
	}

}

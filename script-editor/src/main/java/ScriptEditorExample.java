import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.scijava.Context;
import org.scijava.ui.swing.script.TextEditor;

public class ScriptEditorExample {
	public static void main(final String[] args) throws Exception {
		// Create the SciJava context.
		final Context context = new Context();

		// Create a script editor component.
		final TextEditor editor = new TextEditor(context);

		// Dispose the context when the script editor window closes.
		editor.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(final WindowEvent e) {
				context.dispose();
			}
		});

		// Show it!
		editor.setVisible(true);
	}
}

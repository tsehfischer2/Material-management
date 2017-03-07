package kucunguanli;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MainScreen {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainScreen window = new MainScreen();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("\u5E93\u5B58\u7BA1\u7406");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(38, 48, 80, 27);
		btnNewButton.setText("\u8FDB\u8D27");
		
		Button button = new Button(shell, SWT.NONE);
		button.setText("\u8FDB\u4EF7");
		button.setBounds(38, 101, 80, 27);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setText("\u67E5\u8BE2\u5E93\u5B58");
		button_1.setBounds(38, 154, 80, 27);
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setText("\u552E\u8D27");
		button_2.setBounds(168, 48, 80, 27);
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.setText("\u552E\u4EF7");
		button_3.setBounds(168, 101, 80, 27);
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.setText("\u5546\u54C1\u7EF4\u62A4");
		button_4.setBounds(168, 154, 80, 27);
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setText("New Button");
		button_5.setBounds(283, 48, 80, 27);
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setText("New Button");
		button_6.setBounds(283, 101, 80, 27);
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setText("New Button");
		button_7.setBounds(283, 154, 80, 27);

	}
}

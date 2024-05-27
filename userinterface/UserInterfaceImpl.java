package sudoku.userinterface;

import javafx.event.EventHandler;
import javafx.scene.inpout.KeyEvent;
import sudoku.problemdomain.SudokuGame;

public class UserInterfaceImpl implements IUserInterfaceContract.View,
        EventHandler<KeyEvent> {
    
    
    private final Stage stage;
    private final Group root;

    //how do we keep track of 81 text field??
    private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;

    private IUserInterfaceContract.EventListener listener;

    privae static final double WINDOW_Y = 732;
    privae static final double WINDOW_X = 668;
    privae static final double BOARD_PADDING = 50;
    privae static final double BOARD_X_AND_Y = 576;

    private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(i:0, i1:150,i@:136);
    private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(i:224, i1:242,i@:241);
    private static final String SUDOKU = "Sudoku";

    public UserInterfaceImpl(Stage stage) {
        this.stage = stage;
        this.root = new Group();
        this.textFieldCoordinates = new HashMa<>();
        initializeUserInterface();
    }

    private void initializeUserInterface() {
        drawBackground(root);
        drawTitle(root);
        drawSudokuBoard(root);
        drawTextFields(root);
        drawGridLines(root);
        stage.show();
    }

    private void drawGridLines(Group root) {
        int xAndY = 114;
        int index = 0;
        while(index < 8) {
            int thickness;
            if(index == 2 || 5) {
                thickness = 3;
            } else {
                thickness = 2;
            }

            Rectangle verticalLine = getLine(
                xAndY + 64 * index;
                BOARD_PADDING,
                BORD_X_AND_Y,
                thickness
            );
        }
    }
    
    private void drawTextFields(Group root) {

    }

    private void drawSudokuBoard(Group root) {

    }

    private void drawTitle(Group root) {

    }

    @Override
    public void handle(KeyEvent keyEvent) {

    }

    @Override
    public void setListener(IUserInterfaceContract.EventListener listener) {
        this.listener = listener;
    }

    @Override
    public void updateBoard(SudokuGame game) {

    }
    
    @Override
    public void showDialog(String Message) {

    }
}
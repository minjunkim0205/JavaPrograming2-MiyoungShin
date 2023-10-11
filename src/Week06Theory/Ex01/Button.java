package Week06Theory.Ex01;

public class Button {
    /*Private*/
    private OnClick on_click;
    /*Static*/
    static interface OnClick{
        void onClick();
    }
    /*Constructor*/
    /*Abstract*/
    /*Public*/
    public void setOnClick(OnClick on_click){
        this.on_click = on_click;
    }
    public void touch(){
        on_click.onClick();
    }
    /*ToString*/
}

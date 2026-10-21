package net.duditetro.mvcwithinterface;

public interface MainContract
{
    interface View
    {
        void showGreeting(String message);
    }

    interface Controller
    {
        void onButtonClicked();
    }
}

package net.duditetro.mvcwithinterface;

public class MainController implements MainContract.Controller
{
    private final MainContract.View view;
    private final GreetingModel model;

    public MainController(MainContract.View view)
    {
        this.view = view;
        this.model = new GreetingModel();
    }

    @Override
    public void onButtonClicked()
    {
        String message = model.getGreetingMessage();
        view.showGreeting(message);
    }
}

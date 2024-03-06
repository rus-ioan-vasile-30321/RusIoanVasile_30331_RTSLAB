package Lab2.Application2;

import java.util.Observer;

public class Main {
    private static final int noOfThreads = 6;
    private static final int processorLoad = 1000000;

    public static void main(String[] args) {
        Model model = new Model(noOfThreads);
        View view = new View(noOfThreads);
        Controller controller = new Controller(model, view);
        controller.startThreads(noOfThreads, processorLoad);
    }
}

//  1.Fir class (Model):
//Scope: Represents the model component in the MVC architecture.
//Responsibilities:
//Represents a thread that simulates processing tasks and updating the model's progress.
//Keeps track of its own ID, associated model, and processor load.
//Runs a loop to simulate processing tasks and updates the model's progress values accordingly.
//Sleeps for a short duration between iterations to simulate processing time.

//  2.Model class (Model):
//Scope: Represents the model component in the MVC architecture.
//Responsibilities:
//Manages the data and business logic of the application.
//Stores the progress values for each thread.
//Provides methods to set and retrieve progress values.
//Extends Observable to notify observers (views) of changes to progress values.

//  3.Main class:
//Scope: Entry point of the application.
//        Responsibilities:
//Initializes the model, view, and controller components.
//Starts the application by creating instances of the model, view, and controller.

//  4.View class (View):
//Scope: Represents the view component in the MVC architecture.
//Responsibilities:
//Displays the progress of threads using progress bars.
//Extends JFrame to create a window for displaying the view.
//Implements Observer to receive updates from the model.
//Updates the progress bars based on changes in the model's progress values.
//
//  5.Controller class (Controller):
//Scope: Represents the controller component in the MVC architecture.
//Responsibilities:
//Acts as an intermediary between the model and view components.
//Initializes the model and view and establishes the connection between them.
//Starts threads to simulate processing tasks and updates the model's progress values.

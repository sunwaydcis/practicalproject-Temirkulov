package ch.makery.address.view

import ch.makery.address.MainApp
import javafx.fxml.FXML
import javafx.event.ActionEvent

@FXML
class WelcomeController():
  @FXML
  def handleStart(action: ActionEvent): Unit =
    MainApp.showPersonOverview()

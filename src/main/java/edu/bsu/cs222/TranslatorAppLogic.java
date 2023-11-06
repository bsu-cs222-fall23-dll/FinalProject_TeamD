package edu.bsu.cs222;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

import static edu.bsu.cs222.languageNameToCode.mapLanguageNameToCode;

public class TranslatorAppLogic {
    private final TranslatorAPIHandler translatorAPIHandler;
    private final TranslatorAppGui appGUI;
    private TextField inputTextField;
    private ComboBox<String> languageComboBox;
    private Label resultLabel;

    public TranslatorAppLogic(TranslatorAppGui appGUI) {
        this.appGUI = appGUI;
        this.translatorAPIHandler = new TranslatorAPIHandler("AIzaSyCefoMSOZ4NATjaLsTutfj_lATTwnURkp0"); // Replace with your actual API key
    }

    public Parent getRoot() {
        Label titleLabel = new Label("Welcome to the Translation App");
        Label inputLabel = new Label("Enter a word, phrase, or text in English to translate");
        inputTextField = new TextField();
        Button translateButton = new Button("Translate");
        resultLabel = new Label();
        languageComboBox = new ComboBox<>(supportedLanguages.supportedLanguages);
        languageComboBox.setPromptText("Select Target Language");
        Button historyButton = new Button("View History");

        Font headerAndTextFont = new Font(36); // Define the header font size
        Font buttonFont = new Font(24); // Define the button font size

        FontUtility.setFontSize(headerAndTextFont, titleLabel, inputLabel, inputTextField, resultLabel);
        FontUtility.setFontSize(buttonFont, translateButton, historyButton, languageComboBox);

        // Set the action for the Translation button
        translateButton.setOnAction(e -> translate());

        // Add a key event listener to the inputTextField
        inputTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    translateButton.fire();
                }
            }
        });

        historyButton.setOnAction(e -> appGUI.showHistoryPage());

        // Create and return the root node
        VBox root = new VBox(20);
        root.getChildren().addAll(titleLabel, inputLabel, inputTextField, languageComboBox, translateButton, resultLabel, historyButton);
        root.setSpacing(20);

        return root;
    }
    private void translate() {
        String input = inputTextField.getText();
        String targetLanguageName = languageComboBox.getValue();
        String targetLanguage = mapLanguageNameToCode(targetLanguageName);

        if (targetLanguage == null) {
            resultLabel.setText("Language not recognized. Please try again.");
        } else {
            String translationResult = translatorAPIHandler.translateText(input, "en", targetLanguage);
            resultLabel.setText(translationResult);
            appGUI.getTranslationHistory().add("English to " + targetLanguageName + ": " + input + " -> " + translationResult);
        }
    }
}
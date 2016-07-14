package application;
	
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.*;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(Main.class, (java.lang.String[])null);
    }

    
    public void start(Stage primaryStage) {
        login_scene(primaryStage);
    }

	private Button enter_btn = new Button();
	private Button stats_btn = new Button();
	private Button cancel_btn = new Button();
	private TextField[] text = new TextField[5];
	private final ComboBox<String> regionComboBox = new ComboBox<String>();
	
    private void login_scene(Stage st) {
    	try {
            Pane page = (Pane) FXMLLoader.load(Main.class.getResource("login-scene.fxml"));
            Scene scene = new Scene(page);
            st.setScene(scene);
            
            sign_in_scene(page, st);
    		
            st.setTitle("Login");
            st.setResizable(false);
            
            String css = this.getClass().getResource("login.css").toExternalForm();
            scene.getStylesheets().clear();
            scene.getStylesheets().add(css);
            
            st.show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void sign_in_scene(Pane pn, Stage stage){
    	Button btn = new Button();
		btn.setText("Sign In");
		btn.setLayoutX(380.0);
		btn.setLayoutY(250.0);
		pn.getChildren().add(btn);
		
	    TextField txt = new TextField();
	    txt.setLayoutX(168.0);
		txt.setLayoutY(92.0);
		pn.getChildren().add(txt);
		
		PasswordField password = new PasswordField();
		password.setLayoutX(168.0);
		password.setLayoutY(135.0);
		pn.getChildren().add(password);
		
		Label lbl = new Label();
	    lbl.setLayoutX(148.0);
		lbl.setLayoutY(200.0);
		pn.getChildren().add(lbl);
		
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				if(txt.getText().trim().equals("wert") && password.getText().trim().equals("practica")){
					stage.close();
					//email_send mail = new email_send();
					//mail.send();
					Stage stage2 = new Stage();

					Pane page2;
					try {
						page2 = (Pane) FXMLLoader.load(Main.class.getResource("data-enter.fxml"));
			            Scene scene = new Scene(page2);
			            stage2.setScene(scene);
			            
			            data_enter(page2, stage2);
			    		
			            stage2.setTitle("Data Enter");
			            stage2.setResizable(false);
			            
			            String css = this.getClass().getResource("data-enter.css").toExternalForm();
			            scene.getStylesheets().clear();
			            scene.getStylesheets().add(css);
						
				        stage2.show();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				else if(txt.getText().trim().equals("") || password.getText().trim().equals("")){
					lbl.setLayoutX(148.0);
					lbl.setText("Please complet all the fields!");
				}
				
				else if((!(txt.getText().trim().equals("")) && !(txt.getText().trim().equals("wert"))) || 
					(!(password.getText().trim().equals("")) && !(password.getText().trim().equals("practica")))){
					lbl.setLayoutX(130.0);
					lbl.setText("Username or Password incorrect!");
				}
			}
			
		});
		
		textfield_on_out(lbl, txt, password);
    }
    
    private void textfield_on_out(Label label, TextField text, PasswordField pass){
    	text.focusedProperty().addListener(new ChangeListener<Boolean>()
    	{
    	    @Override
    	    public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
    	    {
    	        if (newPropertyValue)
    	        {
    	            label.setText("");
    	        }
    	    }
    	});
    	
    	pass.focusedProperty().addListener(new ChangeListener<Boolean>()
    	{
    	    @Override
    	    public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
    	    {
    	        if (newPropertyValue)
    	        {
    	            label.setText("");
    	        }
    	    }
    	});
    }
    
    private void data_enter(Pane pn, Stage st){
		enter_btn.setText("Enter");
		enter_btn.setPrefWidth(55.0);
		enter_btn.setLayoutX(317.0);
		enter_btn.setLayoutY(254.0);
		pn.getChildren().add(enter_btn);
		
		enter_btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				data_base output = new data_base();
				try {
					output.fname = text[0].getText();
					output.lname = text[1].getText();
					output.email = text[2].getText();
					if(!regionComboBox.getSelectionModel().isEmpty())
						output.region = regionComboBox.getValue().toString();
					if(!(text[3].getText().trim().equals("")))
						output.age = Integer.parseInt(text[3].getText());
					output.sex = text[4].getText();
					output.DB_insert();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				for(int i = 0; i < 5; i++)
					text[i].setText("");
				
				regionComboBox.setValue("Select region");
			}
		});
		
		cancel_btn.setText("Cancel");
		cancel_btn.setPrefWidth(55.0);
		cancel_btn.setLayoutX(391.0);
		cancel_btn.setLayoutY(254.0);
		pn.getChildren().add(cancel_btn);
		
		cancel_btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				st.close();
				
				data_base extract_mail = new data_base();
				try {
					extract_mail.mailDB();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		stats_btn.setText("Stats");
		stats_btn.setPrefWidth(55.0);
		stats_btn.setLayoutX(20.0);
		stats_btn.setLayoutY(254.0);
		pn.getChildren().add(stats_btn);
		
		stats_btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				Stage stage3 = new Stage();
				HBox layout = new HBox();
				VBox vertical1 = new VBox();
				VBox vertical2 = new VBox();
				layout.getChildren().addAll(vertical1, vertical2);
				Scene scene = new Scene(layout, 780d, 500d);
				
				try {
					region_chart(vertical1);
					age_chart(vertical1);
					sex_chart(vertical2);
					time_chart(vertical2);
					
		            stage3.setScene(scene);
		    		
		            stage3.setTitle("Stats");
		            //stage3.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				String css = this.getClass().getResource("charts.css").toExternalForm();
	            scene.getStylesheets().clear();
	            scene.getStylesheets().add(css);
	            
        	    StackPane temproot = new StackPane();
        	    StackPane progressInd = new StackPane();
        	    ProgressIndicator pind = new ProgressIndicator();
        	    progressInd.setMaxSize(200, 200);
        	    progressInd.getChildren().add(pind);
        	    temproot.getChildren().add(progressInd);
				scene.setRoot(temproot);
				stage3.show();
				
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						scene.setRoot(layout);
					}
				}, 5000);
			}
		});
		
		regionComboBox.getItems().addAll("Africa", "Asia", "Australia", 
							"Europe", "North America", "South America");
		regionComboBox.setLayoutX(111.0);
		regionComboBox.setLayoutY(127.0);
		regionComboBox.setPrefWidth(160.0);
		regionComboBox.setPrefHeight(25);
		regionComboBox.setPromptText("Select region");
		pn.getChildren().add(regionComboBox);
		
		for(int i = 0; i < 5; i++){
			text[i] = new TextField();
			text[i].setPrefHeight(25.0);
			if(i < 3)
				text[i].setPrefWidth(215.0);
			else
				text[i].setPrefWidth(102.0);
			text[i].setLayoutX(111.0);
			if(i < 3)
				text[i].setLayoutY(25 + 34*i);
			else
				text[i].setLayoutY(25 + 34*(i+1));
			pn.getChildren().add(text[i]);
		}
    }
    
    private void region_chart(VBox vb) throws Exception{
    	data_base chart_obj = new data_base();
    	chart_obj.DB_extract();
    	if(chart_obj.africa_contor !=0 || chart_obj.asia_contor !=0 || 
				chart_obj.australia_contor !=0 || chart_obj.europe_contor !=0 || 
				chart_obj.north_america_contor !=0 || chart_obj.south_america_contor !=0)
		{
			ObservableList<PieChart.Data> pieChartData =
	                FXCollections.observableArrayList(
	                new PieChart.Data("Africa (" + Math.round(chart_obj.africa_contor*100.0
                    		/ (chart_obj.africa_contor + chart_obj.asia_contor + chart_obj.australia_contor +
                    			chart_obj.europe_contor + chart_obj.north_america_contor + 
                    			chart_obj.south_america_contor)) + "%)", chart_obj.africa_contor),
	                new PieChart.Data("Asia (" + Math.round(chart_obj.asia_contor*100.0
                    		/ (chart_obj.africa_contor + chart_obj.asia_contor + chart_obj.australia_contor +
                    			chart_obj.europe_contor + chart_obj.north_america_contor + 
                    			chart_obj.south_america_contor)) + "%)", chart_obj.asia_contor),
	                new PieChart.Data("Australia (" + Math.round(chart_obj.australia_contor*100.0
                    		/ (chart_obj.africa_contor + chart_obj.asia_contor + chart_obj.australia_contor +
                    			chart_obj.europe_contor + chart_obj.north_america_contor + 
                    			chart_obj.south_america_contor)) + "%)", chart_obj.australia_contor),
	                new PieChart.Data("Europe (" + Math.round(chart_obj.europe_contor*100.0
                    		/ (chart_obj.africa_contor + chart_obj.asia_contor + chart_obj.australia_contor +
                    			chart_obj.europe_contor + chart_obj.north_america_contor + 
                    			chart_obj.south_america_contor)) + "%)", chart_obj.europe_contor),
	                new PieChart.Data("N. America (" + Math.round(chart_obj.north_america_contor*100.0
                    		/ (chart_obj.africa_contor + chart_obj.asia_contor + chart_obj.australia_contor +
                    			chart_obj.europe_contor + chart_obj.north_america_contor + 
                    			chart_obj.south_america_contor)) + "%)", chart_obj.north_america_contor),
	                new PieChart.Data("S. America (" + Math.round(chart_obj.south_america_contor*100.0
                    		/ (chart_obj.africa_contor + chart_obj.asia_contor + chart_obj.australia_contor +
                    			chart_obj.europe_contor + chart_obj.north_america_contor + 
                    			chart_obj.south_america_contor)) + "%)", chart_obj.south_america_contor));
	        final PieChart chart = new PieChart(pieChartData);
	        chart.setTitle("Regions");

	        vb.getChildren().addAll(chart);
		}
    }
    
    private void age_chart(VBox vb) throws Exception{
    	data_base chart_obj = new data_base();
    	chart_obj.DB_extract();
    	if(chart_obj.Acontor1 !=0 || chart_obj.Acontor2 !=0 || 
				chart_obj.Acontor3 !=0 || chart_obj.Acontor4 !=0)
		{
			ObservableList<PieChart.Data> pieChartData =
	                FXCollections.observableArrayList(
	                new PieChart.Data("15-24 (" + Math.round(chart_obj.Acontor1*100.0
                    		/ (chart_obj.Acontor1 + chart_obj.Acontor2 + 
                    			chart_obj.Acontor3 + chart_obj.Acontor4)) + "%)", chart_obj.Acontor1),
	                new PieChart.Data("25-44 (" + Math.round(chart_obj.Acontor2*100.0
                    		/ (chart_obj.Acontor1 + chart_obj.Acontor2 + 
                    			chart_obj.Acontor3 + chart_obj.Acontor4)) + "%)", chart_obj.Acontor2),
	                new PieChart.Data("45-64 (" + Math.round(chart_obj.Acontor3*100.0
                    		/ (chart_obj.Acontor1 + chart_obj.Acontor2 + 
                    			chart_obj.Acontor3 + chart_obj.Acontor4)) + "%)", chart_obj.Acontor3),
	                new PieChart.Data("65+ (" + Math.round(chart_obj.Acontor4*100.0
                    		/ (chart_obj.Acontor1 + chart_obj.Acontor2 + 
                    			chart_obj.Acontor3 + chart_obj.Acontor4)) + "%)", chart_obj.Acontor4));
	        final PieChart chart = new PieChart(pieChartData);
	        chart.setTitle("Age");

	        vb.getChildren().addAll(chart);
		}
    }
    
    private void sex_chart(VBox vb) throws Exception{
    	data_base chart_obj = new data_base();
    	chart_obj.DB_extract();
    	if(chart_obj.Acontor1 !=0 || chart_obj.Acontor2 !=0 || 
				chart_obj.Acontor3 !=0 || chart_obj.Acontor4 !=0)
		{
			ObservableList<PieChart.Data> pieChartData =
	                FXCollections.observableArrayList(
	                		new PieChart.Data("Male (" + Math.round(chart_obj.male*100.0
	                        		/ (chart_obj.male + chart_obj.female)) + "%)", chart_obj.male),
	    	                new PieChart.Data("Female (" + Math.round(chart_obj.female*100.0
	                        		/ (chart_obj.male + chart_obj.female)) + "%)", chart_obj.female));
	        final PieChart chart = new PieChart(pieChartData);
	        chart.setTitle("Sex");

	        vb.getChildren().addAll(chart);
		}
    }
    
    private void time_chart(VBox vb) throws Exception{
    	data_base chart_obj = new data_base();
    	chart_obj.DB_extract();
    	if(chart_obj.Acontor1 !=0 || chart_obj.Acontor2 !=0 || 
				chart_obj.Acontor3 !=0 || chart_obj.Acontor4 !=0)
		{
			ObservableList<PieChart.Data> pieChartData =
	                FXCollections.observableArrayList(
	                new PieChart.Data("06:00-9:00 (" + Math.round(chart_obj.time1*100.0
                    		/ (chart_obj.time1 + chart_obj.time2 + chart_obj.time3 + chart_obj.time4)) + "%)", chart_obj.time1),
	                new PieChart.Data("09:00-12:00 (" + Math.round(chart_obj.time2*100.0
                    		/ (chart_obj.time1 + chart_obj.time2 + chart_obj.time3 + chart_obj.time4)) + "%)", chart_obj.time2),
	                new PieChart.Data("12:00-15:00 (" + Math.round(chart_obj.time3*100.0
                    		/ (chart_obj.time1 + chart_obj.time2 + chart_obj.time3 + chart_obj.time4)) + "%)", chart_obj.time3),
	                new PieChart.Data("15:00-18:00 (" + Math.round(chart_obj.time4*100.0
                    		/ (chart_obj.time1 + chart_obj.time2 + chart_obj.time3 + chart_obj.time4)) + "%)", chart_obj.time4));
	        final PieChart chart = new PieChart(pieChartData);
	        chart.setTitle("Time");
	        vb.getChildren().addAll(chart);
		}
    }
}

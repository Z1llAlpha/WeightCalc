package zettalpha.weightcalc;

import java.awt.Button;
import java.awt.Choice;
import java.awt.ComponentOrientation;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

	static Boolean isFemale=false;
	
	public static void main(String[] args) {
		//создание окна
		Frame frameMain = new Frame();
		frameMain.setEnabled(false);
		frameMain.setVisible(false);
		//создание объектов интерфейса
		Label titleLabel = new Label();
		Label enterLabel = new Label();
		Label enterHintLabel = new Label();
		Label HeightLabel = new Label();
		Label weightLabel = new Label();
		Label ChestSizeLabel = new Label();
		Label WeistSizeLabel = new Label();
		Label LegSizeLabel = new Label();
		Label sexLabel = new Label();
		Label errorLabel = new Label();
		Label imtVOZLabel = new Label();
		Label imtVOZ = new Label();
		Label imtVOZStatus = new Label();
		Label weightImtVOZLabel = new Label();
		Label weightImtVOZ = new Label();
		Label brokeBrooksWeightLabel = new Label();
		Label brokeBrooksWeight = new Label();
		Label brokeWeightLabel = new Label();
		Label brokeWeight = new Label();
		Label breightmanWeightLabel = new Label();
		Label breightmanWeight = new Label();
		Label berngardtWeightLabel = new Label();
		Label berngardtWeight = new Label();
		Label NoordenWeightLabel = new Label();
		Label NoordenWeight = new Label();
		Label TatonyaWeightLabel = new Label();
		Label TatonyaWeight = new Label();
		Label DavinWeightLabel = new Label();
		Label DavinWeight = new Label();
		Label centralFatIndexLabel = new Label();
		Label centralFatIndex = new Label();
		Label centralFatIndexStatus = new Label();
		Label volumeRatioLabel = new Label();
		Label volumeRatio = new Label();
		Label volumeRatioStatus = new Label();
		Button CalcButton = new Button();
		TextField heightTextField = new TextField("",3);
		TextField weightTextField = new TextField("",6);
		TextField chestSizeTextField = new TextField("",7);
		TextField weistSizeTextField = new TextField("",7);
		TextField legSizeTextField = new TextField("",7);
		Choice sex = new Choice();
		//создание объектов layout и constraintsConfig
		GridBagLayout layoutManagerMain = new GridBagLayout();
		GridBagConstraints constraintsConfig = new GridBagConstraints();
		constraintsConfig.anchor=constraintsConfig.WEST;
		constraintsConfig.fill=constraintsConfig.HORIZONTAL;
		//добавление возможности закрыть программу кнопкой
		frameMain.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		//настройка окна
		frameMain.setTitle("Калькулятор весовых показателей");
		frameMain.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frameMain.setLayout(layoutManagerMain);
		//добавление элементов интерфейса на фрейм
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=0;
		frameMain.add(titleLabel,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=1;
		frameMain.add(enterLabel,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=2;
		frameMain.add(HeightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=2;
		frameMain.add(heightTextField,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=3;
		frameMain.add(weightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=3;
		frameMain.add(weightTextField,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=4;
		frameMain.add(ChestSizeLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=4;
		frameMain.add(chestSizeTextField,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=5;
		frameMain.add(WeistSizeLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=5;
		frameMain.add(weistSizeTextField,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=6;
		frameMain.add(LegSizeLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=6;
		frameMain.add(legSizeTextField,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=7;
		frameMain.add(sexLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=7;
		frameMain.add(sex,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=8;
		frameMain.add(enterHintLabel,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=9;
		frameMain.add(CalcButton,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=10;
		frameMain.add(errorLabel,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=11;
		frameMain.add(imtVOZLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=11;
		frameMain.add(imtVOZ,constraintsConfig);
		constraintsConfig.gridx=2;
		constraintsConfig.gridy=11;
		frameMain.add(imtVOZStatus,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=12;
		frameMain.add(weightImtVOZLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=12;
		frameMain.add(weightImtVOZ,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=13;
		frameMain.add(brokeBrooksWeightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=13;
		frameMain.add(brokeBrooksWeight,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=14;
		frameMain.add(brokeWeightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=14;
		frameMain.add(brokeWeight,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=15;
		frameMain.add(breightmanWeightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=15;
		frameMain.add(breightmanWeight,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=16;
		frameMain.add(berngardtWeightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=16;
		frameMain.add(berngardtWeight,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=17;
		frameMain.add(NoordenWeightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=17;
		frameMain.add(NoordenWeight,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=18;
		frameMain.add(TatonyaWeightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=18;
		frameMain.add(TatonyaWeight,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=19;
		frameMain.add(DavinWeightLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=19;
		frameMain.add(DavinWeight,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=20;
		frameMain.add(centralFatIndexLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=20;
		frameMain.add(centralFatIndex,constraintsConfig);
		constraintsConfig.gridx=2;
		constraintsConfig.gridy=20;
		frameMain.add(centralFatIndexStatus,constraintsConfig);
		constraintsConfig.gridx=0;
		constraintsConfig.gridy=21;
		frameMain.add(volumeRatioLabel,constraintsConfig);
		constraintsConfig.gridx=1;
		constraintsConfig.gridy=21;
		frameMain.add(volumeRatio,constraintsConfig);
		constraintsConfig.gridx=2;
		constraintsConfig.gridy=21;
		frameMain.add(volumeRatioStatus,constraintsConfig);
		//настройка компонентов
		titleLabel.setText("Калькулятор весовых показателей");
		enterLabel.setText("Введите данные в поля ниже:");
		enterHintLabel.setText("Для расчета только имт введите 1 везде, кроме роста и веса");
		HeightLabel.setText("Рост");
		weightLabel.setText("Вес");
		ChestSizeLabel.setText("Обхват груди в см");
		WeistSizeLabel.setText("Обхват талии в см");
		LegSizeLabel.setText("Обхват бедра в см");
		sexLabel.setText("Пол");
		sex.add("мужской");
		sex.add("женский");
		sex.select(0);
		errorLabel.setText("Данные не введены");
		CalcButton.setLabel("Рассчитать");
		CalcButton.setEnabled(true);
		imtVOZLabel.setText("Индекс ИМТ по ВОЗ: ");
		weightImtVOZLabel.setText("Оптимальный вес по ИМТ(воз): ");
		brokeBrooksWeightLabel.setText("Оптимальный вес по Броку-Бруксу: ");
		brokeWeightLabel.setText("Оптимальный вес по Броку: ");
		breightmanWeightLabel.setText("Оптимальный вес по Брейтману: ");
		berngardtWeightLabel.setText("Оптимальный вес по Бернгардту: ");
		NoordenWeightLabel.setText("Оптимальный вес по Ноордену: ");
		TatonyaWeightLabel.setText("Оптимальный вес по Татоня: ");
		DavinWeightLabel.setText("Оптимальный вес по Дэвину: ");
		centralFatIndexLabel.setText("Индекс центрального ожирения: ");
		volumeRatioLabel.setText("Отношение объема талии к объему бедер");
		//обработка нажатия на кнопку
		CalcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//проверка на ошибки
				if(checkTextField(heightTextField) | checkTextField(weightTextField) | checkTextField(chestSizeTextField) | checkTextField(weistSizeTextField) | checkTextField(legSizeTextField)) {
					errorLabel.setText("Ошибка! Проверьте введенные данные");
					imtVOZ.setText("");
					imtVOZStatus.setText("");
					weightImtVOZ.setText("");
					brokeBrooksWeight.setText("");
					brokeWeight.setText("");
					breightmanWeight.setText("");
					berngardtWeight.setText("");
					NoordenWeight.setText("");
					TatonyaWeight.setText("");
					DavinWeight.setText("");
					centralFatIndex.setText("");
					centralFatIndexStatus.setText("");
					volumeRatio.setText("");
					volumeRatioStatus.setText("");
					frameMain.pack();
				} else {
					errorLabel.setText("Ошибок в введенных данных нет");
					//рассчет имт и веса по воз
					double weight, height, imt;
					height=Double.parseDouble(heightTextField.getText());
					weight=Double.parseDouble(weightTextField.getText());
					imt=weight/Math.pow(height/100.00, 2);
					imtVOZ.setText(round2(imt));
					String status;
					if(imt<16.00) {
						status="Выраженный дефицит массы тела";
					} else if(imt<18.50) {
						status="Недостаточная (дефицит) масса тела";
					} else if(imt<25.00) {
						status="Норма";
					} else if(imt<30.00) {
						status="Избыточная масса тела (предожирение)";
					} else if(imt<35.00) {
						status="Ожирение 1 степени";
					} else if(imt<40.00) {
						status="Ожирение 2 степени";
					} else {
						status="Ожирение 3 степени";
					}
					imtVOZStatus.setText(status);
					double weightMin, weightMax, weightMid;
					weightMin=Math.pow(height/100.00, 2)*18.50;
					weightMax=Math.pow(height/100.00, 2)*25.00;
					weightMid=Math.pow(height/100.00, 2)*21.75;
					weightImtVOZ.setText(round2(weightMid)+" ("+round2(weightMin)+"-"+round2(weightMax)+") кг");
					//рассчет веса по остальным имт
					double brokeBrooksWeightD, brokeWeightD, breightmanWeightD, berngardtWeightD, noordenWeightD, tatonyaWeightD, davinWeightD;
					if(height<165) {
						brokeBrooksWeightD=height-100.00;
					} else if(height<=175) {
						brokeBrooksWeightD=height-105.00;
					} else {
						brokeBrooksWeightD=height-110.00;
					}
					brokeBrooksWeight.setText(round2(brokeBrooksWeightD)+" кг");
					switch(sex.getSelectedIndex()) {
						case 0:
							isFemale=false;
							break;
						case 1:
							isFemale=true;
							break;
					}
					if(height>=155.00 && height<=170.00) {
						if(isFemale) {
							brokeWeightD=(height-100.00)*0.85;
						} else {
							brokeWeightD=(height-100.00)*0.90;
						}
						brokeWeight.setText(round2(brokeWeightD)+" кг");
					} else {
						brokeWeight.setText("Нельзя рассчитать для такого роста");
					}
					breightmanWeightD=height*0.70-50.00;
					breightmanWeight.setText(round2(breightmanWeightD)+" кг");
					berngardtWeightD=height*Double.parseDouble(chestSizeTextField.getText())/240.00;
					berngardtWeight.setText(round2(berngardtWeightD)+" кг");
					noordenWeightD=height*0.42;
					NoordenWeight.setText(round2(noordenWeightD)+" кг");
					tatonyaWeightD=height-(100.00+(height-100.00)/20.00);
					TatonyaWeight.setText(round2(tatonyaWeightD)+" кг");
					if(isFemale) {
						davinWeightD=45.50+2.30*(height/2.54-60.00);
					} else {
						davinWeightD=50.00+2.30*(height/2.54-60.00);
					}
					DavinWeight.setText(round2(davinWeightD));
					//рассчет индекса ожирения и соотношения объемов
					double weistSize, legSize, centralFatIndexD, volumeRatioD;
					weistSize=Double.parseDouble(weistSizeTextField.getText());
					centralFatIndexD=weistSize/100.00;
					centralFatIndex.setText(round2(centralFatIndexD));
					if(centralFatIndexD<0.54) {
						centralFatIndexStatus.setText("Норма");
					} else {
						centralFatIndexStatus.setText("Превышение");
					}
					legSize=Double.parseDouble(legSizeTextField.getText());
					volumeRatioD=weistSize/legSize;
					volumeRatio.setText(round2(volumeRatioD));
					if(isFemale) {
						if(volumeRatioD<0.80) {
							volumeRatioStatus.setText("Норма");
						} else {
							volumeRatioStatus.setText("Превышение");
						}
					} else {
						if(volumeRatioD<0.95) {
							volumeRatioStatus.setText("Норма");
						} else {
							volumeRatioStatus.setText("Превышение");
						}
					}
					frameMain.resize(730, 540); //изменение размера окна
				}
			}
		});
		//включение отображения окна
		frameMain.pack();
		frameMain.setEnabled(true);
		frameMain.setVisible(true);
	}
	
	//функция проверки текстового поля
	public static Boolean checkTextField(TextField tf) {
		String str = tf.getText();
		if(str.isEmpty()) {
			return true;
		}
		str=str.replace(',', '.');
		try {
			double temp = Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return true;
		}
		return false;
	}

	//функция округления double до 2 знаков после запятой и преобразования в string
	public static String round2(double d) {
		return String.format("%.2f", d);
	}
	
}

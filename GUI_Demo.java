package JavaCoursework;

/**
 * @author (Amit Baniya)
 * @version (1.0)
 */

//importing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import java.util.*;

public class GUI_Demo implements ActionListener{
    //--------------------------Declaration of Components---------------------\\

    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    //+++++++++++++++++++++++++Main Window++++++++++++++++++++++++++++++++++\\
    private JPanel mainWindow;
    private JButton exitButton;
    //**************************Fuel Car****************************\\
    private JPanel mainWindowFuelCarSubContainer;
    private JLabel mainWindowFuelCarHeading;
    private JButton mainWindowFuelCarAddButton;
    private JButton mainWindowFuelCarPurchaseButton;
    private JButton mainWindowFuelCarDisplayButton;

    //**************************************************************\\
    //**************************Electric Car****************************\\
    private JPanel mainWindowElectricCarSubContainer;
    private JLabel mainWindowElectricCarHeading;
    private JButton mainWindowElectricCarAddButton;
    private JButton mainWindowElectricCarBuyButton;
    private JButton mainWindowElectricCarSellButton;
    private JButton mainWindowElectricCarDisplayButton;
    //**************************************************************\\

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    //+++++++++++++++++++++++++Fuel Car Windows++++++++++++++++++++++++++++++++++\\
    //************************Add Car Window**************************\\
    private JPanel addWindowFuelCar;
    private JButton addWindowFuelCarMainButton;
    private JButton addWindowFuelCarClearButton;
    private JButton addWindowFuelCarAddButton;

    private JLabel addWindowFuelCarHeading;
    private JPanel addWindowFuelCarSubContainer;
    private JLabel addWindowFuelCarId;
    private JTextField addWindowFuelCarIdText;
    private JLabel addWindowFuelCarName;
    private JTextField addWindowFuelCarNameText;
    private JLabel addWindowFuelCarBrand;
    private JTextField addWindowFuelCarBrandText;
    private JLabel addWindowFuelType;
    private JTextField addWindowFuelTypeText;
    private JLabel addWindowFuelCarSeats;
    private JTextField addWindowFuelCarSeatsText;
    private JLabel addWindowFuelCarMileage;
    private JTextField addWindowFuelCarMileageText;
    private JLabel addWindowFuelCarPrice;
    private JTextField addWindowFuelCarPriceText;

    //****************************************************************\\
    //************************Purchase Window*************************\\
    private JPanel purchaseWindow;
    private JButton purchaseWindowMainButton;
    private JButton purchaseWindowClearButton;
    private JButton purchaseWindowPurchaseButton;

    private JLabel purchaseWindowHeading;
    private JPanel purchaseWindowSubContainer;
    private JLabel purchaseWindowCarId;
    private JTextField purchaseWindowCarIdText;
    private JLabel purchaseWindowCarName;
    private JTextField purchaseWindowCarNameText;
    private JLabel purchaseWindowCarBrand;
    private JTextField purchaseWindowCarBrandText;
    private JLabel purchaseWindowCarColor;
    private JTextField purchaseWindowCarColorText;
    private JLabel purchaseWindowTransmissionType;
    private JTextField purchaseWindowTransmissionTypeText;
    private JLabel purchaseWindowDistributorName;
    private JTextField purchaseWindowDistributorNameText;
    private JLabel purchaseWindowBookedDate;
    private JComboBox purchaseWindowBookedDateYear;
    private JComboBox purchaseWindowBookedDateMonth;
    private JComboBox purchaseWindowBookedDateDay;
    private JLabel purchaseWindowPurchaseDate;
    private JComboBox purchaseWindowPurchaseDateYear;
    private JComboBox purchaseWindowPurchaseDateMonth;
    private JComboBox purchaseWindowPurchaseDateDay;

    //****************************************************************\\

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\

    //+++++++++++++++++++++++Electric Car Windows++++++++++++++++++++++++++++++++\\
    //************************Add Car Window**************************\\
    private JPanel addWindowElectricCar;
    private JButton addWindowElectricCarMainButton;
    private JButton addWindowElectricCarClearButton;
    private JButton addWindowElectricCarAddButton;

    private JLabel addWindowElectricCarHeading;
    private JPanel addWindowElectricCarSubContainer;
    private JLabel addWindowElectricCarId;
    private JTextField addWindowElectricCarIdText;
    private JLabel addWindowElectricCarName;
    private JTextField addWindowElectricCarNameText;
    private JLabel addWindowElectricCarBrand;
    private JTextField addWindowElectricCarBrandText;
    private JLabel addWindowElectricCarCapacity;
    private JTextField addWindowElectricCarCapacityText;
    private JLabel addWindowElectricCarPrice;
    private JTextField addWindowElectricCarPriceText;

    //****************************************************************\\
    //***************************Buy Window***************************\\
    private JPanel buyWindow;
    private JButton buyWindowMainButton;
    private JButton buyWindowClearButton;
    private JButton buyWindowBuyButton;

    private JLabel buyWindowHeading;
    private JPanel buyWindowSubContainer;
    private JLabel buyWindowCarId;
    private JTextField buyWindowCarIdText;
    private JLabel buyWindowCarName;
    private JTextField buyWindowCarNameText;
    private JLabel buyWindowCarBrand;
    private JTextField buyWindowCarBrandText;
    private JLabel buyWindowCarColor;
    private JTextField buyWindowCarColorText;
    private JLabel buyWindowCustomerName;
    private JTextField buyWindowCustomerNameText;
    private JLabel buyWindowBatteryWarranty;
    private JTextField buyWindowBatteryWarrantyText;
    private JLabel buyWindowRange;
    private JTextField buyWindowRangeText;
    private JLabel buyWindowRechargeTime;
    private JTextField buyWindowRechargeTimeText;
    private JLabel buyWindowCarPrice;
    private JTextField buyWindowCarPriceText;
    private JLabel buyWindowPurchaseDate;
    private JComboBox buyWindowPurchaseDateYear;
    private JComboBox buyWindowPurchaseDateMonth;
    private JComboBox buyWindowPurchaseDateDay;

    //****************************************************************\\
    //**************************Sell Window***************************\\
    private JPanel sellWindow;
    private JButton sellWindowMainButton;
    private JButton sellWindowClearButton;
    private JButton sellWindowSellButton;

    private JLabel sellWindowHeading;
    private JPanel sellWindowSubContainer;
    private JLabel sellWindowCarId;
    private JTextField sellWindowCarIdText;
    private JLabel sellWindowCustomerName;
    private JTextField sellWindowCustomerNameText;

    //****************************************************************\\

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    //------------------------------------------------------------------------\\

    private ArrayList<Car> cars=new ArrayList<Car>();


    public GUI_Demo(){
        ConstructionGUI();
    }

    public void ConstructionGUI(){
        //+++++++++MainFrame and background layout and panel+++++++++++++++++++\\
        frame = new JFrame();
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
        //xxxxxxxxxxxxxxxxxxxxCreation and Properties of componentsxxxxxxxxxxxxxxxxxxxxxxx\\
        //+++++++++++++++++++++++++Main Window++++++++++++++++++++++++++++++++++\\

        mainWindow = new JPanel();
        mainWindow.setBackground(new Color(20, 22, 23));
        mainWindow.setLayout(null);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(550, 576, 182, 77);
        exitButton.setForeground(new Color(173, 216, 230));
        exitButton.setBackground(new Color(148, 46, 61));
        exitButton.setFont(new Font("Serif", Font.PLAIN, 35));
        exitButton.addActionListener(this);

        //**************************Fuel Car****************************\\

        mainWindowFuelCarSubContainer = new JPanel();
        mainWindowFuelCarSubContainer.setBackground(new Color(34, 36, 38));
        mainWindowFuelCarSubContainer.setBounds(127, 67, 403, 427);

        mainWindowFuelCarHeading = new JLabel("Fuel Car");
        mainWindowFuelCarHeading.setForeground(new Color(180, 53, 70));
        mainWindowFuelCarHeading.setBounds(216, 131, 226, 67);
        mainWindowFuelCarHeading.setFont(new Font("Serif", Font.PLAIN, 48));

        mainWindowFuelCarAddButton = new JButton("Add Car");
        mainWindowFuelCarAddButton.setForeground(new Color(238, 55, 80));
        mainWindowFuelCarAddButton.setBackground(new Color(26, 26, 31));
        mainWindowFuelCarAddButton.setBorder(BorderFactory.createLineBorder(new Color(238, 55, 80)));
        mainWindowFuelCarAddButton.setBounds(198, 220, 262, 43);
        mainWindowFuelCarAddButton.setFont(new Font("Serif", Font.PLAIN, 35));
        mainWindowFuelCarAddButton.addActionListener(this);

        mainWindowFuelCarPurchaseButton = new JButton("Purchase Car");
        mainWindowFuelCarPurchaseButton.setForeground(new Color(238, 55, 80));
        mainWindowFuelCarPurchaseButton.setBackground(new Color(26, 26, 31));
        mainWindowFuelCarPurchaseButton.setBorder(BorderFactory.createLineBorder(new Color(238, 55, 80)));
        mainWindowFuelCarPurchaseButton.setBounds(198, 302, 262, 43);
        mainWindowFuelCarPurchaseButton.setFont(new Font("Serif", Font.PLAIN, 35));
        mainWindowFuelCarPurchaseButton.addActionListener(this);

        mainWindowFuelCarDisplayButton = new JButton("Display Car");
        mainWindowFuelCarDisplayButton.setForeground(new Color(238, 55, 80));
        mainWindowFuelCarDisplayButton.setBackground(new Color(26, 26, 31));
        mainWindowFuelCarDisplayButton.setBorder(BorderFactory.createLineBorder(new Color(238, 55, 80)));
        mainWindowFuelCarDisplayButton.setBounds(198, 384, 262, 43);
        mainWindowFuelCarDisplayButton.setFont(new Font("Serif", Font.PLAIN, 35));
        mainWindowFuelCarDisplayButton.addActionListener(this);

        //**************************************************************\\

        //************************Electric Car**************************\\

        mainWindowElectricCarSubContainer = new JPanel();
        mainWindowElectricCarSubContainer.setBackground(new Color(34, 36, 38));
        mainWindowElectricCarSubContainer.setBounds(751, 67, 403, 427);

        mainWindowElectricCarHeading = new JLabel("Electric Car");
        mainWindowElectricCarHeading.setForeground(new Color(180, 53, 70));
        mainWindowElectricCarHeading.setBounds(830, 131, 331, 67);
        mainWindowElectricCarHeading.setFont(new Font("Serif", Font.PLAIN, 48));

        mainWindowElectricCarAddButton = new JButton("Add Car");
        mainWindowElectricCarAddButton.setForeground(new Color(238, 55, 80));
        mainWindowElectricCarAddButton.setBackground(new Color(26, 26, 31));
        mainWindowElectricCarAddButton.setBorder(BorderFactory.createLineBorder(new Color(238, 55, 80)));
        mainWindowElectricCarAddButton.setBounds(840, 220, 225, 43);
        mainWindowElectricCarAddButton.setFont(new Font("Serif", Font.PLAIN, 35));
        mainWindowElectricCarAddButton.addActionListener(this);

        mainWindowElectricCarBuyButton = new JButton("Buy Car");
        mainWindowElectricCarBuyButton.setForeground(new Color(238, 55, 80));
        mainWindowElectricCarBuyButton.setBackground(new Color(26, 26, 31));
        mainWindowElectricCarBuyButton.setBorder(BorderFactory.createLineBorder(new Color(238, 55, 80)));
        mainWindowElectricCarBuyButton.setBounds(840, 280,225, 43);
        mainWindowElectricCarBuyButton.setFont(new Font("Serif", Font.PLAIN, 35));
        mainWindowElectricCarBuyButton.addActionListener(this);

        mainWindowElectricCarSellButton = new JButton("Sell Car");
        mainWindowElectricCarSellButton.setForeground(new Color(238, 55, 80));
        mainWindowElectricCarSellButton.setBackground(new Color(26, 26, 31));
        mainWindowElectricCarSellButton.setBorder(BorderFactory.createLineBorder(new Color(238, 55, 80)));
        mainWindowElectricCarSellButton.setBounds(840, 340, 225, 43);
        mainWindowElectricCarSellButton.setFont(new Font("Serif", Font.PLAIN, 35));
        mainWindowElectricCarSellButton.addActionListener(this);

        mainWindowElectricCarDisplayButton = new JButton("Display Car");
        mainWindowElectricCarDisplayButton.setForeground(new Color(238, 55, 80));
        mainWindowElectricCarDisplayButton.setBackground(new Color(26, 26, 31));
        mainWindowElectricCarDisplayButton.setBorder(BorderFactory.createLineBorder(new Color(238, 55, 80)));
        mainWindowElectricCarDisplayButton.setBounds(840, 400, 225, 43);
        mainWindowElectricCarDisplayButton.setFont(new Font("Serif", Font.PLAIN, 35));
        mainWindowElectricCarDisplayButton.addActionListener(this);

        //**************************************************************\\

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\

        //+++++++++++++++++++++++++Fuel Car Windows++++++++++++++++++++++++++++++++++\\
        //************************Add Car Window**************************\\
        addWindowFuelCar = new JPanel();
        addWindowFuelCar.setLayout(null);
        addWindowFuelCar.setBackground(new Color(20, 22, 23));

        addWindowFuelCarMainButton = new JButton("Main Menu");
        addWindowFuelCarMainButton.setBounds(487, 584, 305, 77);
        addWindowFuelCarMainButton.setForeground(new Color(173, 216, 230));
        addWindowFuelCarMainButton.setBackground(new Color(148, 46, 61));
        addWindowFuelCarMainButton.setFont(new Font("Serif", Font.PLAIN, 55));
        addWindowFuelCarMainButton.addActionListener(this);

        addWindowFuelCarAddButton = new JButton("Add");
        addWindowFuelCarAddButton.setBounds(582, 492, 124, 57);
        addWindowFuelCarAddButton.setForeground(new Color(173, 216, 230));
        addWindowFuelCarAddButton.setBackground(new Color(148, 46, 61));
        addWindowFuelCarAddButton.setFont(new Font("Serif", Font.PLAIN, 35));
        addWindowFuelCarAddButton.addActionListener(this);

        addWindowFuelCarClearButton = new JButton("Clear");
        addWindowFuelCarClearButton.setBounds(950, 492, 99, 46);
        addWindowFuelCarClearButton.setForeground(new Color(173, 216, 230));
        addWindowFuelCarClearButton.setBackground(new Color(148, 46, 61));
        addWindowFuelCarClearButton.setFont(new Font("Serif", Font.PLAIN, 28));
        addWindowFuelCarClearButton.addActionListener(this);

        addWindowFuelCarHeading = new JLabel("Add Fuel Car");
        addWindowFuelCarHeading.setBounds(457, 23, 365, 96);
        addWindowFuelCarHeading.setForeground(new Color(180, 53, 70));
        addWindowFuelCarHeading.setFont(new Font("Serif", Font.PLAIN, 60));

        addWindowFuelCarId = new JLabel("Car ID:");
        addWindowFuelCarId.setBounds(212, 130, 96, 49);
        addWindowFuelCarId.setForeground(new Color(238, 55, 80));
        addWindowFuelCarId.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowFuelCarIdText = new JTextField();
        addWindowFuelCarIdText.setBounds(212, 170, 322, 39);
        addWindowFuelCarIdText.setBackground(new Color(146, 146, 146));
        addWindowFuelCarIdText.setForeground(new Color(155, 7, 7));
        addWindowFuelCarIdText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowFuelCarIdText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowFuelCarName = new JLabel("Car Name:");
        addWindowFuelCarName.setBounds(212, 228, 152, 49);
        addWindowFuelCarName.setForeground(new Color(238, 55, 80));
        addWindowFuelCarName.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowFuelCarNameText = new JTextField();
        addWindowFuelCarNameText.setBounds(212, 268, 322, 39);
        addWindowFuelCarNameText.setBackground(new Color(146, 146, 146));
        addWindowFuelCarNameText.setForeground(new Color(155, 7, 7));
        addWindowFuelCarNameText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowFuelCarNameText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowFuelCarBrand = new JLabel("Car Brand:");
        addWindowFuelCarBrand.setBounds(212, 326, 152, 49);
        addWindowFuelCarBrand.setForeground(new Color(238, 55, 80));
        addWindowFuelCarBrand.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowFuelCarBrandText = new JTextField();
        addWindowFuelCarBrandText.setBounds(212, 366, 322, 39);
        addWindowFuelCarBrandText.setBackground(new Color(146, 146, 146));
        addWindowFuelCarBrandText.setForeground(new Color(155, 7, 7));
        addWindowFuelCarBrandText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowFuelCarBrandText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowFuelType = new JLabel("Fuel Type:");
        addWindowFuelType.setBounds(754, 130, 153, 49);
        addWindowFuelType.setForeground(new Color(238, 55, 80));
        addWindowFuelType.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowFuelTypeText = new JTextField();
        addWindowFuelTypeText.setBounds(754, 170, 322, 39);
        addWindowFuelTypeText.setBackground(new Color(146, 146, 146));
        addWindowFuelTypeText.setForeground(new Color(155, 7, 7));
        addWindowFuelTypeText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowFuelTypeText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowFuelCarSeats = new JLabel("Number of Seats");
        addWindowFuelCarSeats.setBounds(754, 228, 229, 49);
        addWindowFuelCarSeats.setForeground(new Color(238, 55, 80));
        addWindowFuelCarSeats.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowFuelCarSeatsText = new JTextField();
        addWindowFuelCarSeatsText.setBounds(754, 268, 322, 39);
        addWindowFuelCarSeatsText.setBackground(new Color(146, 146, 146));
        addWindowFuelCarSeatsText.setForeground(new Color(155, 7, 7));
        addWindowFuelCarSeatsText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowFuelCarSeatsText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowFuelCarMileage = new JLabel("Mileage:");
        addWindowFuelCarMileage.setBounds(754, 326, 116, 49);
        addWindowFuelCarMileage.setForeground(new Color(238, 55, 80));
        addWindowFuelCarMileage.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowFuelCarMileageText = new JTextField();
        addWindowFuelCarMileageText.setBounds(754, 366, 322, 39);
        addWindowFuelCarMileageText.setBackground(new Color(146, 146, 146));
        addWindowFuelCarMileageText.setForeground(new Color(155, 7, 7));
        addWindowFuelCarMileageText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowFuelCarMileageText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowFuelCarPrice = new JLabel("Car Price:");
        addWindowFuelCarPrice.setBounds(414, 426, 133, 49);
        addWindowFuelCarPrice.setForeground(new Color(238, 55, 80));
        addWindowFuelCarPrice.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowFuelCarPriceText = new JTextField();
        addWindowFuelCarPriceText.setBounds(552, 426, 315, 49);
        addWindowFuelCarPriceText.setBackground(new Color(146, 146, 146));
        addWindowFuelCarPriceText.setForeground(new Color(155, 7, 7));
        addWindowFuelCarPriceText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowFuelCarPriceText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowFuelCarSubContainer = new JPanel();
        addWindowFuelCarSubContainer.setBounds(38, 119, 1204, 442);
        addWindowFuelCarSubContainer.setBackground(new Color(34, 36, 38));

        //****************************************************************\\

        //************************Purchase Window*************************\\
        purchaseWindow = new JPanel();
        purchaseWindow.setLayout(null);
        purchaseWindow.setBackground(new Color(20, 22, 23));

        purchaseWindowMainButton = new JButton("Main Menu");
        purchaseWindowMainButton.setBounds(487, 584, 305, 77);
        purchaseWindowMainButton.setForeground(new Color(173, 216, 230));
        purchaseWindowMainButton.setBackground(new Color(148, 46, 61));
        purchaseWindowMainButton.setFont(new Font("Serif", Font.PLAIN, 55));
        purchaseWindowMainButton.addActionListener(this);

        purchaseWindowPurchaseButton = new JButton("Purchase");
        purchaseWindowPurchaseButton.setBounds(541, 488, 208, 59);
        purchaseWindowPurchaseButton.setForeground(new Color(173, 216, 230));
        purchaseWindowPurchaseButton.setBackground(new Color(148, 46, 61));
        purchaseWindowPurchaseButton.setFont(new Font("Serif", Font.PLAIN, 35));
        purchaseWindowPurchaseButton.addActionListener(this);

        purchaseWindowClearButton = new JButton("Clear");
        purchaseWindowClearButton.setBounds(983, 502, 99, 46);
        purchaseWindowClearButton.setForeground(new Color(173, 216, 230));
        purchaseWindowClearButton.setBackground(new Color(148, 46, 61));
        purchaseWindowClearButton.setFont(new Font("Serif", Font.PLAIN, 28));
        purchaseWindowClearButton.addActionListener(this);

        purchaseWindowHeading = new JLabel("Purchase Fuel Car");
        purchaseWindowHeading.setBounds(383, 13, 513, 96);
        purchaseWindowHeading.setForeground(new Color(180, 53, 70));
        purchaseWindowHeading.setFont(new Font("Serif", Font.PLAIN, 60));

        purchaseWindowCarId = new JLabel("Car ID:");
        purchaseWindowCarId.setBounds(217, 109, 152, 49);
        purchaseWindowCarId.setForeground(new Color(238, 55, 80));
        purchaseWindowCarId.setFont(new Font("Serif", Font.PLAIN, 30));

        purchaseWindowCarIdText = new JTextField();
        purchaseWindowCarIdText.setBounds(217, 149, 322, 39);
        purchaseWindowCarIdText.setBackground(new Color(146, 146, 146));
        purchaseWindowCarIdText.setForeground(new Color(155, 7, 7));
        purchaseWindowCarIdText.setFont(new Font("Serif", Font.PLAIN, 15));
        purchaseWindowCarIdText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        purchaseWindowCarName = new JLabel("Car Name:");
        purchaseWindowCarName.setBounds(217, 207, 152, 49);
        purchaseWindowCarName.setForeground(new Color(238, 55, 80));
        purchaseWindowCarName.setFont(new Font("Serif", Font.PLAIN, 30));

        purchaseWindowCarNameText = new JTextField();
        purchaseWindowCarNameText.setBounds(217, 247, 322, 39);
        purchaseWindowCarNameText.setBackground(new Color(146, 146, 146));
        purchaseWindowCarNameText.setForeground(new Color(155, 7, 7));
        purchaseWindowCarNameText.setFont(new Font("Serif", Font.PLAIN, 15));
        purchaseWindowCarNameText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        purchaseWindowCarBrand = new JLabel("Car Brand:");
        purchaseWindowCarBrand.setBounds(217, 305, 152, 49);
        purchaseWindowCarBrand.setForeground(new Color(238, 55, 80));
        purchaseWindowCarBrand.setFont(new Font("Serif", Font.PLAIN, 30));

        purchaseWindowCarBrandText = new JTextField();
        purchaseWindowCarBrandText.setBounds(217, 345, 322, 39);
        purchaseWindowCarBrandText.setBackground(new Color(146, 146, 146));
        purchaseWindowCarBrandText.setForeground(new Color(155, 7, 7));
        purchaseWindowCarBrandText.setFont(new Font("Serif", Font.PLAIN, 15));
        purchaseWindowCarBrandText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        purchaseWindowCarColor = new JLabel("Car Color:");
        purchaseWindowCarColor.setBounds(753, 109, 146, 49);
        purchaseWindowCarColor.setForeground(new Color(238, 55, 80));
        purchaseWindowCarColor.setFont(new Font("Serif", Font.PLAIN, 30));

        purchaseWindowCarColorText = new JTextField();
        purchaseWindowCarColorText.setBounds(753, 149, 322, 39);
        purchaseWindowCarColorText.setBackground(new Color(146, 146, 146));
        purchaseWindowCarColorText.setForeground(new Color(155, 7, 7));
        purchaseWindowCarColorText.setFont(new Font("Serif", Font.PLAIN, 15));
        purchaseWindowCarColorText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        purchaseWindowTransmissionType = new JLabel("Transmission Type:");
        purchaseWindowTransmissionType.setBounds(753, 207, 262, 49);
        purchaseWindowTransmissionType.setForeground(new Color(238, 55, 80));
        purchaseWindowTransmissionType.setFont(new Font("Serif", Font.PLAIN, 30));

        purchaseWindowTransmissionTypeText = new JTextField();
        purchaseWindowTransmissionTypeText.setBounds(753, 247, 322, 39);
        purchaseWindowTransmissionTypeText.setBackground(new Color(146, 146, 146));
        purchaseWindowTransmissionTypeText.setForeground(new Color(155, 7, 7));
        purchaseWindowTransmissionTypeText.setFont(new Font("Serif", Font.PLAIN, 15));
        purchaseWindowTransmissionTypeText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        purchaseWindowDistributorName = new JLabel("Distributor Name:");
        purchaseWindowDistributorName.setBounds(753, 305, 245, 49);
        purchaseWindowDistributorName.setForeground(new Color(238, 55, 80));
        purchaseWindowDistributorName.setFont(new Font("Serif", Font.PLAIN, 30));

        purchaseWindowDistributorNameText = new JTextField();
        purchaseWindowDistributorNameText.setBounds(753, 345, 322, 39);
        purchaseWindowDistributorNameText.setBackground(new Color(146, 146, 146));
        purchaseWindowDistributorNameText.setForeground(new Color(155, 7, 7));
        purchaseWindowDistributorNameText.setFont(new Font("Serif", Font.PLAIN, 15));
        purchaseWindowDistributorNameText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        purchaseWindowBookedDate= new JLabel("Booked Date:");
        purchaseWindowBookedDate.setBounds(217, 387, 188, 49);
        purchaseWindowBookedDate.setForeground(new Color(238, 55, 80));
        purchaseWindowBookedDate.setFont(new Font("Serif", Font.PLAIN, 30));

        purchaseWindowBookedDateYear = new JComboBox();
        purchaseWindowBookedDateYear.setBounds(217, 436, 72, 32);
        purchaseWindowBookedDateYear.setBackground(new Color(146, 146, 146));
        purchaseWindowBookedDateYear.setForeground(new Color(155, 7, 7));
        purchaseWindowBookedDateYear.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        purchaseWindowBookedDateYear.setModel(new DefaultComboBoxModel<String>(getYears()));
        purchaseWindowBookedDateYear.addActionListener(this);

        purchaseWindowBookedDateMonth = new JComboBox();
        purchaseWindowBookedDateMonth.setBounds(297, 436, 76, 32);
        purchaseWindowBookedDateMonth.setBackground(new Color(146, 146, 146));
        purchaseWindowBookedDateMonth.setForeground(new Color(155, 7, 7));
        purchaseWindowBookedDateMonth.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        purchaseWindowBookedDateMonth.setModel(new DefaultComboBoxModel<String>(getMonths()));
        purchaseWindowBookedDateMonth.addActionListener(this);

        String[] day = new String[]{"Day"};
        purchaseWindowBookedDateDay = new JComboBox(day);
        purchaseWindowBookedDateDay.setBounds(383, 436, 72, 32);
        purchaseWindowBookedDateDay.setBackground(new Color(146, 146, 146));
        purchaseWindowBookedDateDay.setForeground(new Color(155, 7, 7));
        purchaseWindowBookedDateDay.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        purchaseWindowPurchaseDate= new JLabel("Purchase Date:");
        purchaseWindowPurchaseDate.setBounds(753, 387, 214, 49);
        purchaseWindowPurchaseDate.setForeground(new Color(238, 55, 80));
        purchaseWindowPurchaseDate.setFont(new Font("Serif", Font.PLAIN, 30));

        purchaseWindowPurchaseDateYear = new JComboBox();
        purchaseWindowPurchaseDateYear.setBounds(753, 436, 72, 32);
        purchaseWindowPurchaseDateYear.setBackground(new Color(146, 146, 146));
        purchaseWindowPurchaseDateYear.setForeground(new Color(155, 7, 7));
        purchaseWindowPurchaseDateYear.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        purchaseWindowPurchaseDateYear.setModel(new DefaultComboBoxModel<String>(getYears()));
        purchaseWindowPurchaseDateYear.addActionListener(this);

        purchaseWindowPurchaseDateMonth = new JComboBox();
        purchaseWindowPurchaseDateMonth.setBounds(833, 436, 76, 32);
        purchaseWindowPurchaseDateMonth.setBackground(new Color(146, 146, 146));
        purchaseWindowPurchaseDateMonth.setForeground(new Color(155, 7, 7));
        purchaseWindowPurchaseDateMonth.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        purchaseWindowPurchaseDateMonth.setModel(new DefaultComboBoxModel<String>(getMonths()));
        purchaseWindowPurchaseDateMonth.addActionListener(this);

        purchaseWindowPurchaseDateDay = new JComboBox(day);
        purchaseWindowPurchaseDateDay.setBounds(919, 436, 72, 32);
        purchaseWindowPurchaseDateDay.setBackground(new Color(146, 146, 146));
        purchaseWindowPurchaseDateDay.setForeground(new Color(155, 7, 7));
        purchaseWindowPurchaseDateDay.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        purchaseWindowSubContainer = new JPanel();
        purchaseWindowSubContainer.setBounds(44, 96, 1204, 466);
        purchaseWindowSubContainer.setBackground(new Color(34, 36, 38));

        //****************************************************************\\

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
        //+++++++++++++++++++++++Electric Car Windows++++++++++++++++++++++++++++++++\\
        //************************Add Car Window**************************\\
        addWindowElectricCar = new JPanel();
        addWindowElectricCar.setLayout(null);
        addWindowElectricCar.setBackground(new Color(20, 22, 23));

        addWindowElectricCarMainButton = new JButton("Main Menu");
        addWindowElectricCarMainButton.setBounds(487, 584, 305, 77);
        addWindowElectricCarMainButton.setForeground(new Color(173, 216, 230));
        addWindowElectricCarMainButton.setBackground(new Color(148, 46, 61));
        addWindowElectricCarMainButton.setFont(new Font("Serif", Font.PLAIN, 55));
        addWindowElectricCarMainButton.addActionListener(this);

        addWindowElectricCarAddButton = new JButton("Add");
        addWindowElectricCarAddButton.setBounds(586, 434, 124, 57);
        addWindowElectricCarAddButton.setForeground(new Color(173, 216, 230));
        addWindowElectricCarAddButton.setBackground(new Color(148, 46, 61));
        addWindowElectricCarAddButton.setFont(new Font("Serif", Font.PLAIN, 35));
        addWindowElectricCarAddButton.addActionListener(this);

        addWindowElectricCarClearButton = new JButton("Clear");
        addWindowElectricCarClearButton.setBounds(951, 436, 99, 46);
        addWindowElectricCarClearButton.setForeground(new Color(173, 216, 230));
        addWindowElectricCarClearButton.setBackground(new Color(148, 46, 61));
        addWindowElectricCarClearButton.setFont(new Font("Serif", Font.PLAIN, 28));
        addWindowElectricCarClearButton.addActionListener(this);

        addWindowElectricCarHeading = new JLabel("Add Electric Car");
        addWindowElectricCarHeading.setBounds(421, 40, 438, 96);
        addWindowElectricCarHeading.setForeground(new Color(180, 53, 70));
        addWindowElectricCarHeading.setFont(new Font("Serif", Font.PLAIN, 60));

        addWindowElectricCarId = new JLabel("Car ID:");
        addWindowElectricCarId.setBounds(213, 169, 96, 49);
        addWindowElectricCarId.setForeground(new Color(238, 55, 80));
        addWindowElectricCarId.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowElectricCarIdText = new JTextField();
        addWindowElectricCarIdText.setBounds(213, 209, 322, 39);
        addWindowElectricCarIdText.setForeground(new Color(155, 7, 7));
        addWindowElectricCarIdText.setBackground(new Color(146, 146, 146));
        addWindowElectricCarIdText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowElectricCarIdText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowElectricCarName = new JLabel("Car Name:");
        addWindowElectricCarName.setBounds(213, 267, 152, 49);
        addWindowElectricCarName.setForeground(new Color(238, 55, 80));
        addWindowElectricCarName.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowElectricCarNameText = new JTextField();
        addWindowElectricCarNameText.setBounds(213, 307, 322, 39);
        addWindowElectricCarNameText.setForeground(new Color(155, 7, 7));
        addWindowElectricCarNameText.setBackground(new Color(146, 146, 146));
        addWindowElectricCarNameText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowElectricCarNameText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowElectricCarBrand = new JLabel("Car Brand:");
        addWindowElectricCarBrand.setBounds(727, 169, 152, 49);
        addWindowElectricCarBrand.setForeground(new Color(238, 55, 80));
        addWindowElectricCarBrand.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowElectricCarBrandText = new JTextField();
        addWindowElectricCarBrandText.setBounds(727, 209, 322, 39);
        addWindowElectricCarBrandText.setForeground(new Color(155, 7, 7));
        addWindowElectricCarBrandText.setBackground(new Color(146, 146, 146));
        addWindowElectricCarBrandText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowElectricCarBrandText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowElectricCarCapacity = new JLabel("Battery Capacity:");
        addWindowElectricCarCapacity.setBounds(727, 267, 241, 49);
        addWindowElectricCarCapacity.setForeground(new Color(238, 55, 80));
        addWindowElectricCarCapacity.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowElectricCarCapacityText = new JTextField();
        addWindowElectricCarCapacityText.setBounds(727, 307, 322, 39);
        addWindowElectricCarCapacityText.setForeground(new Color(155, 7, 7));
        addWindowElectricCarCapacityText.setBackground(new Color(146, 146, 146));
        addWindowElectricCarCapacityText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowElectricCarCapacityText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowElectricCarPrice = new JLabel("Car Price:");
        addWindowElectricCarPrice.setBounds(421, 366, 133, 49);
        addWindowElectricCarPrice.setForeground(new Color(238, 55, 80));
        addWindowElectricCarPrice.setFont(new Font("Serif", Font.PLAIN, 30));

        addWindowElectricCarPriceText = new JTextField();
        addWindowElectricCarPriceText.setBounds(559, 366, 315, 49);
        addWindowElectricCarPriceText.setForeground(new Color(155, 7, 7));
        addWindowElectricCarPriceText.setBackground(new Color(146, 146, 146));
        addWindowElectricCarPriceText.setFont(new Font("Serif", Font.PLAIN, 15));
        addWindowElectricCarPriceText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        addWindowElectricCarSubContainer = new JPanel();
        addWindowElectricCarSubContainer.setBounds(38, 159, 1204, 353);
        addWindowElectricCarSubContainer.setBackground(new Color(34, 36, 38));
        //****************************************************************\\

        //***************************Buy Window***************************\\
        buyWindow = new JPanel();
        buyWindow.setLayout(null);
        buyWindow.setBackground(new Color(20, 22, 23));

        buyWindowMainButton = new JButton("Main Menu");
        buyWindowMainButton.setBounds(487, 584, 305, 77);
        buyWindowMainButton.setForeground(new Color(173, 216, 230));
        buyWindowMainButton.setBackground(new Color(148, 46, 61));
        buyWindowMainButton.setFont(new Font("Serif", Font.PLAIN, 55));
        buyWindowMainButton.addActionListener(this);

        buyWindowBuyButton = new JButton("Buy");
        buyWindowBuyButton.setBounds(570, 502, 139, 59);
        buyWindowBuyButton.setForeground(new Color(173, 216, 230));
        buyWindowBuyButton.setBackground(new Color(148, 46, 61));
        buyWindowBuyButton.setFont(new Font("Serif", Font.PLAIN, 35));
        buyWindowBuyButton.addActionListener(this);

        buyWindowClearButton = new JButton("Clear");
        buyWindowClearButton.setBounds(975, 502, 99, 46);
        buyWindowClearButton.setForeground(new Color(173, 216, 230));
        buyWindowClearButton.setBackground(new Color(148, 46, 61));
        buyWindowClearButton.setFont(new Font("Serif", Font.PLAIN, 28));
        buyWindowClearButton.addActionListener(this);

        buyWindowHeading = new JLabel("Buy Electric Car");
        buyWindowHeading.setBounds(383, -8, 513, 96);
        buyWindowHeading.setForeground(new Color(180, 53, 70));
        buyWindowHeading.setFont(new Font("Serif", Font.PLAIN, 60));

        buyWindowCarId = new JLabel("Car ID:");
        buyWindowCarId.setBounds(211, 86, 96, 49);
        buyWindowCarId.setForeground(new Color(238, 55, 80));
        buyWindowCarId.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowCarIdText = new JTextField();
        buyWindowCarIdText.setBounds(211, 126, 322, 39);
        buyWindowCarIdText.setBackground(new Color(146, 146, 146));
        buyWindowCarIdText.setForeground(new Color(155, 7, 7));
        buyWindowCarIdText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowCarIdText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowCarName = new JLabel("Car Name:");
        buyWindowCarName.setBounds(211, 169, 152, 49);
        buyWindowCarName.setForeground(new Color(238, 55, 80));
        buyWindowCarName.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowCarNameText = new JTextField();
        buyWindowCarNameText.setBounds(211, 209, 322, 39);
        buyWindowCarNameText.setBackground(new Color(146, 146, 146));
        buyWindowCarNameText.setForeground(new Color(155, 7, 7));
        buyWindowCarNameText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowCarNameText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowCarBrand = new JLabel("Car Brand:");
        buyWindowCarBrand.setBounds(211, 252, 152, 49);
        buyWindowCarBrand.setForeground(new Color(238, 55, 80));
        buyWindowCarBrand.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowCarBrandText = new JTextField();
        buyWindowCarBrandText.setBounds(211, 292, 322, 39);
        buyWindowCarBrandText.setBackground(new Color(146, 146, 146));
        buyWindowCarBrandText.setForeground(new Color(155, 7, 7));
        buyWindowCarBrandText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowCarBrandText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowCarColor = new JLabel("Car Color:");
        buyWindowCarColor.setBounds(211, 335, 152, 49);
        buyWindowCarColor.setForeground(new Color(238, 55, 80));
        buyWindowCarColor.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowCarColorText = new JTextField();
        buyWindowCarColorText.setBounds(211, 375, 322, 39);
        buyWindowCarColorText.setBackground(new Color(146, 146, 146));
        buyWindowCarColorText.setForeground(new Color(155, 7, 7));
        buyWindowCarColorText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowCarColorText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowCustomerName = new JLabel("Customer Name:");
        buyWindowCustomerName.setBounds(768, 86, 237, 49);
        buyWindowCustomerName.setForeground(new Color(238, 55, 80));
        buyWindowCustomerName.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowCustomerNameText = new JTextField();
        buyWindowCustomerNameText.setBounds(768, 126, 322, 39);
        buyWindowCustomerNameText.setBackground(new Color(146, 146, 146));
        buyWindowCustomerNameText.setForeground(new Color(155, 7, 7));
        buyWindowCustomerNameText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowCustomerNameText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowBatteryWarranty = new JLabel("Battery Warranty:");
        buyWindowBatteryWarranty.setBounds(768, 169, 237, 49);
        buyWindowBatteryWarranty.setForeground(new Color(238, 55, 80));
        buyWindowBatteryWarranty.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowBatteryWarrantyText = new JTextField();
        buyWindowBatteryWarrantyText.setBounds(768, 209, 322, 39);
        buyWindowBatteryWarrantyText.setBackground(new Color(146, 146, 146));
        buyWindowBatteryWarrantyText.setForeground(new Color(155, 7, 7));
        buyWindowBatteryWarrantyText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowBatteryWarrantyText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowRange= new JLabel("Range:");
        buyWindowRange.setBounds(768, 252, 103, 49);
        buyWindowRange.setForeground(new Color(238, 55, 80));
        buyWindowRange.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowRangeText = new JTextField();
        buyWindowRangeText.setBounds(768, 292, 322, 39);
        buyWindowRangeText.setBackground(new Color(146, 146, 146));
        buyWindowRangeText.setForeground(new Color(155, 7, 7));
        buyWindowRangeText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowRangeText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowRechargeTime = new JLabel("Recharge Time:");
        buyWindowRechargeTime.setBounds(768, 335, 216, 49);
        buyWindowRechargeTime.setForeground(new Color(238, 55, 80));
        buyWindowRechargeTime.setFont(new Font("Serif", Font.PLAIN, 30)); 

        buyWindowRechargeTimeText = new JTextField();
        buyWindowRechargeTimeText.setBounds(768, 375, 322, 39);
        buyWindowRechargeTimeText.setBackground(new Color(146, 146, 146));
        buyWindowRechargeTimeText.setForeground(new Color(155, 7, 7));
        buyWindowRechargeTimeText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowRechargeTimeText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowCarPrice= new JLabel(" Car Price:");
        buyWindowCarPrice.setBounds(211, 418, 133, 49);
        buyWindowCarPrice.setForeground(new Color(238, 55, 80));
        buyWindowCarPrice.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowCarPriceText = new JTextField();
        buyWindowCarPriceText.setBounds(211, 458, 322, 39);
        buyWindowCarPriceText.setBackground(new Color(146, 146, 146));
        buyWindowCarPriceText.setForeground(new Color(155, 7, 7));
        buyWindowCarPriceText.setFont(new Font("Serif", Font.PLAIN, 15));
        buyWindowCarPriceText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowPurchaseDate= new JLabel("Purchase Date:");
        buyWindowPurchaseDate.setBounds(768, 418, 214, 49);
        buyWindowPurchaseDate.setForeground(new Color(238, 55, 80));
        buyWindowPurchaseDate.setFont(new Font("Serif", Font.PLAIN, 30));

        buyWindowPurchaseDateYear = new JComboBox();
        buyWindowPurchaseDateYear.setBounds(768, 461, 72, 32);
        buyWindowPurchaseDateYear.setBackground(new Color(146, 146, 146));
        buyWindowPurchaseDateYear.setForeground(new Color(155, 7, 7));
        buyWindowPurchaseDateYear.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        buyWindowPurchaseDateYear.setModel(new DefaultComboBoxModel<String>(getYears()));
        buyWindowPurchaseDateYear.addActionListener(this);

        buyWindowPurchaseDateMonth = new JComboBox();
        buyWindowPurchaseDateMonth.setBounds(848, 461, 76, 32);
        buyWindowPurchaseDateMonth.setBackground(new Color(146, 146, 146));
        buyWindowPurchaseDateMonth.setForeground(new Color(155, 7, 7));
        buyWindowPurchaseDateMonth.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        buyWindowPurchaseDateMonth.setModel(new DefaultComboBoxModel<String>(getMonths()));
        buyWindowPurchaseDateMonth.addActionListener(this);

        buyWindowPurchaseDateDay = new JComboBox(day);
        buyWindowPurchaseDateDay.setBounds(934, 461, 72, 32);
        buyWindowPurchaseDateDay.setBackground(new Color(146, 146, 146));
        buyWindowPurchaseDateDay.setForeground(new Color(155, 7, 7));
        buyWindowPurchaseDateDay.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        buyWindowSubContainer = new JPanel();
        buyWindowSubContainer.setBounds(38, 73, 1204, 501);
        buyWindowSubContainer.setBackground(new Color(34, 36, 38));

        //****************************************************************\\
        //***************************Buy Window***************************\\
        sellWindow = new JPanel();
        sellWindow.setLayout(null);
        sellWindow.setBackground(new Color(20, 22, 23));

        sellWindowMainButton = new JButton("Main Menu");
        sellWindowMainButton.setBounds(487, 584, 305, 77);
        sellWindowMainButton.setForeground(new Color(173, 216, 230));
        sellWindowMainButton.setBackground(new Color(148, 46, 61));
        sellWindowMainButton.setFont(new Font("Serif", Font.PLAIN, 55));
        sellWindowMainButton.addActionListener(this);

        sellWindowSellButton = new JButton("Sell");
        sellWindowSellButton.setBounds(578, 377, 124, 57);
        sellWindowSellButton.setForeground(new Color(173, 216, 230));
        sellWindowSellButton.setBackground(new Color(148, 46, 61));
        sellWindowSellButton.setFont(new Font("Serif", Font.PLAIN, 35));
        sellWindowSellButton.addActionListener(this);

        sellWindowClearButton = new JButton("Clear");
        sellWindowClearButton.setBounds(943, 345, 99, 46);
        sellWindowClearButton.setForeground(new Color(173, 216, 230));
        sellWindowClearButton.setBackground(new Color(148, 46, 61));
        sellWindowClearButton.setFont(new Font("Serif", Font.PLAIN, 28));
        sellWindowClearButton.addActionListener(this);

        sellWindowHeading = new JLabel("Sell Electric Car");
        sellWindowHeading.setBounds(383, -8, 513, 96);
        sellWindowHeading.setForeground(new Color(180, 53, 70));
        sellWindowHeading.setFont(new Font("Serif", Font.PLAIN, 60));

        sellWindowCarId = new JLabel("Car ID:");
        sellWindowCarId.setBounds(222, 227, 96, 49);
        sellWindowCarId.setForeground(new Color(238, 55, 80));
        sellWindowCarId.setFont(new Font("Serif", Font.PLAIN, 30));

        sellWindowCarIdText = new JTextField();
        sellWindowCarIdText.setBounds(211, 267, 322, 39);
        sellWindowCarIdText.setBackground(new Color(146, 146, 146));
        sellWindowCarIdText.setForeground(new Color(155, 7, 7));
        sellWindowCarIdText.setFont(new Font("Serif", Font.PLAIN, 15));
        sellWindowCarIdText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        sellWindowCustomerName = new JLabel("Customer Name:");
        sellWindowCustomerName.setBounds(736, 227, 233, 49);
        sellWindowCustomerName.setForeground(new Color(238, 55, 80));
        sellWindowCustomerName.setFont(new Font("Serif", Font.PLAIN, 30));

        sellWindowCustomerNameText = new JTextField();
        sellWindowCustomerNameText.setBounds(736, 267, 322, 39);
        sellWindowCustomerNameText.setBackground(new Color(146, 146, 146));
        sellWindowCustomerNameText.setForeground(new Color(155, 7, 7));
        sellWindowCustomerNameText.setFont(new Font("Serif", Font.PLAIN, 15));
        sellWindowCustomerNameText.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        sellWindowSubContainer = new JPanel();
        sellWindowSubContainer.setBounds(38, 169, 1204, 327);
        sellWindowSubContainer.setBackground(new Color(34, 36, 38));

        //****************************************************************\\

        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\

        //xxxxxxxxxxxxxxxxxxxAddtion of Components to respective panelsxxxxxxxxxxxxxxxxxxx\\
        //+++++++++++++++++++++++++++Main Window Panel++++++++++++++++++++++++++++++++++++\\
        mainWindow.add(exitButton);
        //**************************Fuel Car****************************\\
        mainWindow.add(mainWindowFuelCarHeading);
        mainWindow.add(mainWindowFuelCarAddButton);
        mainWindow.add(mainWindowFuelCarPurchaseButton);
        mainWindow.add(mainWindowFuelCarDisplayButton);
        mainWindow.add(mainWindowFuelCarSubContainer);

        //**************************************************************\\

        //**************************Electric Car****************************\\
        mainWindow.add(mainWindowElectricCarHeading);
        mainWindow.add(mainWindowElectricCarAddButton);
        mainWindow.add(mainWindowElectricCarBuyButton);
        mainWindow.add(mainWindowElectricCarSellButton);
        mainWindow.add(mainWindowElectricCarDisplayButton);
        mainWindow.add(mainWindowElectricCarSubContainer);

        //**************************************************************\\
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
        //++++++++++++++++++++++++++++Fuel Car Windows+++++++++++++++++++++++++++++++\\
        //**************************Add Window****************************\\
        addWindowFuelCar.add(addWindowFuelCarMainButton);
        addWindowFuelCar.add(addWindowFuelCarAddButton);
        addWindowFuelCar.add(addWindowFuelCarClearButton);
        addWindowFuelCar.add(addWindowFuelCarHeading);
        addWindowFuelCar.add(addWindowFuelCarId);
        addWindowFuelCar.add(addWindowFuelCarIdText);
        addWindowFuelCar.add(addWindowFuelCarName);
        addWindowFuelCar.add(addWindowFuelCarNameText);
        addWindowFuelCar.add(addWindowFuelCarBrand);
        addWindowFuelCar.add(addWindowFuelCarBrandText);
        addWindowFuelCar.add(addWindowFuelType);
        addWindowFuelCar.add(addWindowFuelTypeText);
        addWindowFuelCar.add(addWindowFuelCarSeats);
        addWindowFuelCar.add(addWindowFuelCarSeatsText);
        addWindowFuelCar.add(addWindowFuelCarMileage);
        addWindowFuelCar.add(addWindowFuelCarMileageText);
        addWindowFuelCar.add(addWindowFuelCarPrice);
        addWindowFuelCar.add(addWindowFuelCarPriceText);
        addWindowFuelCar.add(addWindowFuelCarSubContainer);

        //*********************************************************************\\
        //**************************Purchase Window****************************\\
        purchaseWindow.add(purchaseWindowMainButton);
        purchaseWindow.add(purchaseWindowPurchaseButton);
        purchaseWindow.add(purchaseWindowClearButton);
        purchaseWindow.add(purchaseWindowHeading);
        purchaseWindow.add(purchaseWindowCarId);
        purchaseWindow.add(purchaseWindowCarIdText);
        purchaseWindow.add(purchaseWindowCarName);
        purchaseWindow.add(purchaseWindowCarNameText);
        purchaseWindow.add(purchaseWindowCarBrand);
        purchaseWindow.add(purchaseWindowCarBrandText);
        purchaseWindow.add(purchaseWindowCarColor);
        purchaseWindow.add(purchaseWindowCarColorText);
        purchaseWindow.add(purchaseWindowTransmissionType);
        purchaseWindow.add(purchaseWindowTransmissionTypeText);
        purchaseWindow.add(purchaseWindowDistributorName);
        purchaseWindow.add(purchaseWindowDistributorNameText);
        purchaseWindow.add(purchaseWindowBookedDate);
        purchaseWindow.add(purchaseWindowBookedDateYear);
        purchaseWindow.add(purchaseWindowBookedDateMonth);
        purchaseWindow.add(purchaseWindowBookedDateDay);
        purchaseWindow.add(purchaseWindowPurchaseDate);
        purchaseWindow.add(purchaseWindowPurchaseDateYear);
        purchaseWindow.add(purchaseWindowPurchaseDateMonth);
        purchaseWindow.add(purchaseWindowPurchaseDateDay);
        purchaseWindow.add(purchaseWindowSubContainer);

        //*******************************************************************\\
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\

        //++++++++++++++++++++++++++Electric Car Windows+++++++++++++++++++++++++++++\\
        //****************************Add Window*****************************\\
        addWindowElectricCar.add(addWindowElectricCarMainButton);
        addWindowElectricCar.add(addWindowElectricCarAddButton);
        addWindowElectricCar.add(addWindowElectricCarClearButton);
        addWindowElectricCar.add(addWindowElectricCarHeading);
        addWindowElectricCar.add(addWindowElectricCarId);
        addWindowElectricCar.add(addWindowElectricCarIdText);
        addWindowElectricCar.add(addWindowElectricCarName);
        addWindowElectricCar.add(addWindowElectricCarNameText);
        addWindowElectricCar.add(addWindowElectricCarBrand);
        addWindowElectricCar.add(addWindowElectricCarBrandText);
        addWindowElectricCar.add(addWindowElectricCarCapacity);
        addWindowElectricCar.add(addWindowElectricCarCapacityText);
        addWindowElectricCar.add(addWindowElectricCarPrice);
        addWindowElectricCar.add(addWindowElectricCarPriceText);
        addWindowElectricCar.add(addWindowElectricCarSubContainer);

        //*********************************************************************\\
        //****************************Buy Window*******************************\\
        buyWindow.add(buyWindowMainButton);
        buyWindow.add(buyWindowBuyButton);
        buyWindow.add(buyWindowClearButton);
        buyWindow.add(buyWindowHeading);
        buyWindow.add(buyWindowCarId);
        buyWindow.add(buyWindowCarIdText);
        buyWindow.add(buyWindowCarName);
        buyWindow.add(buyWindowCarNameText);
        buyWindow.add(buyWindowCarBrand);
        buyWindow.add(buyWindowCarBrandText);
        buyWindow.add(buyWindowCarColor);
        buyWindow.add(buyWindowCarColorText);
        buyWindow.add(buyWindowCustomerName);
        buyWindow.add(buyWindowCustomerNameText);
        buyWindow.add(buyWindowBatteryWarranty);
        buyWindow.add(buyWindowBatteryWarrantyText);
        buyWindow.add(buyWindowRange);
        buyWindow.add(buyWindowRangeText);
        buyWindow.add(buyWindowRechargeTime);
        buyWindow.add(buyWindowRechargeTimeText);
        buyWindow.add(buyWindowCarPrice);
        buyWindow.add(buyWindowCarPriceText);
        buyWindow.add(buyWindowPurchaseDate);
        buyWindow.add(buyWindowPurchaseDateYear);
        buyWindow.add(buyWindowPurchaseDateDay);
        buyWindow.add(buyWindowPurchaseDateMonth);
        buyWindow.add(buyWindowSubContainer);

        //*********************************************************************\\

        //***************************Sell Window*******************************\\
        sellWindow.add(sellWindowMainButton);
        sellWindow.add(sellWindowSellButton);
        sellWindow.add(sellWindowClearButton);
        sellWindow.add(sellWindowHeading);
        sellWindow.add(sellWindowCarId);
        sellWindow.add(sellWindowCarIdText);
        sellWindow.add(sellWindowCustomerName);
        sellWindow.add(sellWindowCustomerNameText);
        sellWindow.add(sellWindowSubContainer);

        //********************************************************************\\

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\

        //xxxxxxxxxxxxxxAddtion of all the window panels to mainPanel Layoutxxxxxxxxxxxxxxx\\
        mainPanel.add(mainWindow,"mainwindow");
        mainPanel.add(addWindowFuelCar,"addwindowfuelcar");
        mainPanel.add(addWindowElectricCar,"addwindowelectriccar");
        mainPanel.add(purchaseWindow,"purchasewindow");
        mainPanel.add(buyWindow,"buywindow");
        mainPanel.add(sellWindow,"sellwindow");
        frame.add(mainPanel);
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\

        ///xxxxxxxxxxxxxxxxxxxxxxxxxxxProperties of main framexxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == exitButton){
            frame.dispose();
        }

        //xxxxxxxxxxxxxxxxxxxFunctions of Buttons in respective panelsxxxxxxxxxxxxxxxxxxxxx\\
        //+++++++++++++++++++++++++++Main Window Panel++++++++++++++++++++++++++++++++++++\\
        //**************************Fuel Car****************************\\
        if(e.getSource() == mainWindowFuelCarAddButton){
            cardLayout.show(mainPanel, "addwindowfuelcar");
        }

        if(e.getSource() == mainWindowFuelCarPurchaseButton){
            if(cars.isEmpty()){
                int response = JOptionPane.showConfirmDialog(frame, "There is no Car.Please add a car","Confirm",JOptionPane.YES_NO_OPTION );
                if(response == JOptionPane.YES_OPTION){
                    cardLayout.show(mainPanel, "addwindowfuelcar");
                }
                else{
                    cardLayout.show(mainPanel,"mainwindow");
                }
            }
            else{
                cardLayout.show(mainPanel, "purchasewindow");
            }
        };

        if(e.getSource() == mainWindowFuelCarDisplayButton){
            if(cars.isEmpty()){
                JOptionPane.showMessageDialog(frame, "There doesnot seem to be any car");
            }
            else{
                for(Car car:cars){
                    if(car instanceof FuelCar){
                        FuelCar fuelCar = (FuelCar)car;
                        fuelCar.display();
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "There is no fuel Car");
                    }
                }
            }
        }

        //**************************************************************\\

        //**************************Electric Car****************************\\
        if(e.getSource() == mainWindowElectricCarAddButton){
            cardLayout.show(mainPanel, "addwindowelectriccar");
        };

        if(e.getSource() == mainWindowElectricCarBuyButton){
            if(cars.isEmpty()){
                int response = JOptionPane.showConfirmDialog(frame, "There is no Car.Please add a car","Confirm",JOptionPane.YES_NO_OPTION );
                if(response == JOptionPane.YES_OPTION){
                    cardLayout.show(mainPanel, "addwindowelectriccar");
                }
                else{
                    cardLayout.show(mainPanel,"mainwindow");
                }
            }
            else{
                cardLayout.show(mainPanel, "buywindow");
            }
        };

        if(e.getSource() == mainWindowElectricCarSellButton){
            if(cars.isEmpty()){
                int response = JOptionPane.showConfirmDialog(frame, "There is no Car.Please add a car","Confirm",JOptionPane.YES_NO_OPTION );
                if(response == JOptionPane.YES_OPTION){
                    cardLayout.show(mainPanel, "addwindowelectriccar");
                }
                else{
                    cardLayout.show(mainPanel,"mainwindow");
                }
            }
            else{
                cardLayout.show(mainPanel, "sellwindow");
            }

        };

        if(e.getSource() == mainWindowElectricCarDisplayButton){
            if(cars.isEmpty()){
                JOptionPane.showMessageDialog(frame, "There doesnot seem to be any car");
            }
            else{
                for(Car car:cars){
                    if(car instanceof ElectricCar){
                        ElectricCar electricCar = (ElectricCar)car;
                        electricCar.display();
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "There is no Electric Car");
                    }
                }
            }
        }

        //**************************************************************\\
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\

        //+++++++++++++++++++++++++++Fuel Car Windows++++++++++++++++++++++++++++++++\\
        //**************************Add Window***************************\\
        if(e.getSource() == addWindowFuelCarMainButton){
            cardLayout.show(mainPanel, "mainwindow");
        }

        if(e.getSource() == addWindowFuelCarClearButton){
            addWindowFuelCarIdText.setText("");
            addWindowFuelCarNameText.setText("");
            addWindowFuelCarBrandText.setText("");
            addWindowFuelTypeText.setText("");
            addWindowFuelCarSeatsText.setText("");
            addWindowFuelCarMileageText.setText("");
            addWindowFuelCarPriceText.setText("");
        }

        if(e.getSource() == addWindowFuelCarAddButton){
            try{
                int carId = Integer.parseInt(addWindowFuelCarIdText.getText());
                String carName = addWindowFuelCarNameText.getText();
                String carBrand = addWindowFuelCarBrandText.getText();
                String fuelType = addWindowFuelTypeText.getText();
                int numberOfSeats = Integer.parseInt(addWindowFuelCarSeatsText.getText());
                int mileage = Integer.parseInt(addWindowFuelCarMileageText.getText());
                String carPrice = addWindowFuelCarPriceText.getText();
                boolean isThere = false;

                for(Car car:cars){
                    if(car.getCarId() == carId && car instanceof FuelCar){
                        isThere = true;
                        break;
                    }
                }
                if(carName.isEmpty() || carBrand.isEmpty() || fuelType.isEmpty() || carPrice.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Some Fields are yet to be filled. Please fill all the boxes before you add");
                }
                else{
                    if(isThere == false){
                        FuelCar obj = new FuelCar(carId,carName,carBrand,carPrice,fuelType,numberOfSeats,mileage);
                        cars.add(obj);
                        JOptionPane.showMessageDialog(frame,"Car has been added.");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Car Id already exists. Please enter the new Car Id");
                    }

                }

            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Please check if you have entered right informations in these fields(carid, Mileage, and Number of seats)");
            }

        }

        //************************Purchase Window************************\\
        if(e.getSource() == purchaseWindowMainButton){
            cardLayout.show(mainPanel, "mainwindow");
        }

        //=============Booked Date Year ComboBox======================\\
        if(e.getSource() == purchaseWindowBookedDateMonth || e.getSource() == purchaseWindowBookedDateYear){
            String selectedYear = purchaseWindowBookedDateYear.getSelectedItem().toString();
            int selectedYearIndex = purchaseWindowBookedDateYear.getSelectedIndex();
            Calendar calender = Calendar.getInstance();
            int currentYear =  calender.get(Calendar.YEAR);
            int length = currentYear - 2000;
            int selectedYearInInteger = 0;
            for(int a = 1;a<=length;a++){
                if(a == selectedYearIndex){
                    selectedYearInInteger = Integer.parseInt(selectedYear);
                }

            }
            int[] daysNumberInMonths = new int[13];
            if (((selectedYearInInteger % 4 == 0) && (selectedYearInInteger % 100!= 0)) || (selectedYearInInteger%400 == 0)){
                int[] daysNumberInMonthsLeapYear = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
                System.arraycopy(daysNumberInMonthsLeapYear, 0, daysNumberInMonths, 0, 13);
            }
            else{
                int[] daysNumberInMonthsNotLeapYear = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
                System.arraycopy(daysNumberInMonthsNotLeapYear, 0, daysNumberInMonths, 0, 13);
            }
            String[] months = new String[13];
            months = getMonths();

            int selectedMonth = purchaseWindowBookedDateMonth.getSelectedIndex();

            for(int i = 1; i<=13;i++){
                if(selectedMonth == i){
                    String[] days = new String[daysNumberInMonths[i]+1];
                    days[0] = "Day";
                    for(int j=1;j<=daysNumberInMonths[i];j++){
                        days[j] = Integer.toString(j);
                    }

                    purchaseWindowBookedDateDay.setModel(new DefaultComboBoxModel<String>(days));
                }
            }

        }
        //============================================================\\

        //=============Purchase Date Year ComboBox====================\\
        if(e.getSource() == purchaseWindowPurchaseDateMonth || e.getSource() == purchaseWindowPurchaseDateYear){
            String selectedYear = purchaseWindowPurchaseDateYear.getSelectedItem().toString();
            int selectedYearIndex = purchaseWindowPurchaseDateYear.getSelectedIndex();
            Calendar calender = Calendar.getInstance();
            int currentYear =  calender.get(Calendar.YEAR);
            int length = currentYear - 2000;
            int selectedYearInInteger = 0;
            for(int a = 1;a<=length;a++){
                if(a == selectedYearIndex){
                    selectedYearInInteger = Integer.parseInt(selectedYear);
                }

            }
            int[] daysNumberInMonths = new int[13];
            if (((selectedYearInInteger % 4 == 0) && (selectedYearInInteger % 100!= 0)) || (selectedYearInInteger%400 == 0)){
                int[] daysNumberInMonthsLeapYear = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
                System.arraycopy(daysNumberInMonthsLeapYear, 0, daysNumberInMonths, 0, 13);
            }
            else{
                int[] daysNumberInMonthsNotLeapYear = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
                System.arraycopy(daysNumberInMonthsNotLeapYear, 0, daysNumberInMonths, 0, 13);
            }
            String[] months = new String[13];
            months = getMonths();

            int selectedMonth = purchaseWindowPurchaseDateMonth.getSelectedIndex();

            for(int i = 1; i<=13;i++){
                if(selectedMonth == i){
                    String[] days = new String[daysNumberInMonths[i]+1];
                    days[0] = "Day";
                    for(int j=1;j<=daysNumberInMonths[i];j++){
                        days[j] = Integer.toString(j);
                    }

                    purchaseWindowPurchaseDateDay.setModel(new DefaultComboBoxModel<String>(days));
                }
            }

        }
        //============================================================\\

        if(e.getSource() == purchaseWindowClearButton){
            purchaseWindowCarIdText.setText("");
            purchaseWindowCarNameText.setText("");
            purchaseWindowCarBrandText.setText("");
            purchaseWindowCarColorText.setText("");
            purchaseWindowTransmissionTypeText.setText("");
            purchaseWindowDistributorNameText.setText("");
            purchaseWindowBookedDateYear.setSelectedIndex(0);
            purchaseWindowBookedDateMonth.setSelectedIndex(0);
            purchaseWindowBookedDateDay.setSelectedIndex(0);
            purchaseWindowPurchaseDateYear.setSelectedIndex(0);
            purchaseWindowPurchaseDateMonth.setSelectedIndex(0);
            purchaseWindowPurchaseDateDay.setSelectedIndex(0);
        }

        if(e.getSource() == purchaseWindowPurchaseButton){

            if(purchaseWindowCarIdText.getText() == "" || purchaseWindowCarBrandText.getText() == "" || purchaseWindowCarNameText.getText() == ""|| purchaseWindowCarColorText.getText() == "" ||
            purchaseWindowTransmissionTypeText.getText() =="" || purchaseWindowDistributorNameText.getText() == "" || 
            purchaseWindowBookedDateYear.getSelectedItem() == "Year" || purchaseWindowBookedDateMonth.getSelectedItem() == "Month" || 
            purchaseWindowBookedDateDay.getSelectedItem() == "Day" || purchaseWindowPurchaseDateYear.getSelectedItem() == "Year" || purchaseWindowPurchaseDateMonth.getSelectedItem() == "Month" || 
            purchaseWindowPurchaseDateDay.getSelectedItem() == "Day"){
                JOptionPane.showMessageDialog(frame, "Some fields have not been entered or selected");
            }
            else{

                try{
                    int carId = Integer.parseInt(purchaseWindowCarIdText.getText());
                    String carName = purchaseWindowCarNameText.getText();
                    String carBrand = purchaseWindowCarBrandText.getText();
                    String carColor = purchaseWindowCarColorText.getText();
                    String transmissionType = purchaseWindowTransmissionTypeText.getText();
                    String distributorName = purchaseWindowDistributorNameText.getText();
                    String bookedDate = purchaseWindowBookedDateYear.getSelectedItem().toString() + purchaseWindowBookedDateMonth.getSelectedItem().toString()
                        + purchaseWindowBookedDateDay.getSelectedItem().toString();
                    String purchaseDate = purchaseWindowPurchaseDateYear.getSelectedItem().toString() + purchaseWindowPurchaseDateMonth.getSelectedItem().toString()
                        + purchaseWindowPurchaseDateDay.getSelectedItem().toString();
                    boolean isThere = false;
                    for(Car car:cars){
                        if(car.getCarId() == carId && car instanceof FuelCar){
                            FuelCar fuelCar = (FuelCar)car;
                            if(fuelCar.getIsPurchased() == true){
                                JOptionPane.showMessageDialog(frame, "This car has already been purchased.");

                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"This car is now purchased. ");
                            }
                            fuelCar.purchaseFuelCar(bookedDate, purchaseDate);
                            isThere = false;
                            break;

                        }

                    }

                    if(isThere == true){
                        JOptionPane.showMessageDialog(frame, "There is no Car of this Car Id in fuelCar. Please enter the correct CarId");
                    }

                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "You have entered some invalid information in Car Id . Please enter the correct Car Id");
                }

            }
        }

        //**************************************************************\\
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\

        //++++++++++++++++++++++++++Electric Car Windows+++++++++++++++++++++++++++++\\
        //**************************Add Window***************************\\
        //this shows the main window and hides the addwindow of electric car//
        if(e.getSource() == addWindowElectricCarMainButton){
            cardLayout.show(mainPanel, "mainwindow");
        }
        //================================================================//

        //this clears the fields of electriccar//
        if(e.getSource() == addWindowElectricCarClearButton){
            addWindowElectricCarIdText.setText("");
            addWindowElectricCarNameText.setText("");
            addWindowElectricCarBrandText.setText("");
            addWindowElectricCarCapacityText.setText("");
            addWindowElectricCarPriceText.setText("");
        }
        //========================================//

        //this adds the objects of ElectricCar to Car by upcasting//
        if(e.getSource() == addWindowElectricCarAddButton){{
                try{
                    int carId = Integer.parseInt(addWindowElectricCarIdText.getText());
                    String carName = addWindowElectricCarNameText.getText();
                    String carBrand = addWindowElectricCarBrandText.getText();
                    int batteryCapacity = Integer.parseInt(addWindowElectricCarCapacityText.getText());
                    String carPrice = addWindowElectricCarPriceText.getText();
                    boolean isThere = false;

                    for(Car car:cars){
                        if(car.getCarId() == carId && car instanceof ElectricCar){
                            isThere = true;
                            break;
                        }
                    }
                    if(carName.isEmpty() || carBrand.isEmpty() || carPrice.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "Some Fields are yet to be filled. Please fill all the boxes before you add");
                    }
                    else{
                        if(isThere == false){
                            ElectricCar obj = new ElectricCar(carId,carName,carBrand,carPrice, batteryCapacity);
                            cars.add(obj);
                            JOptionPane.showMessageDialog(frame,"Car has been added.");
                        }
                        else{
                            JOptionPane.showMessageDialog(frame, "Car Id already exists. Please enter the new Car Id");
                        }

                    }

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please check if you have entered right informations in these fields(carid and battery Capacity)");
                }

            }}
        //==================================================//
        //**************************************************************\\
        //**************************Buy Window***************************\\
        //this shows the mainWindow button and hides the buyWindowButton//
        if(e.getSource() == buyWindowMainButton){
            cardLayout.show(mainPanel, "mainwindow");
        }
        //=============================================================//

        //=============Purchase Date Year ComboBox====================\\
        //this sets the day according the the year and months//
        if(e.getSource() == buyWindowPurchaseDateMonth || e.getSource() == buyWindowPurchaseDateYear){
            String selectedYear = buyWindowPurchaseDateYear.getSelectedItem().toString();
            int selectedYearIndex = buyWindowPurchaseDateYear.getSelectedIndex();
            Calendar calender = Calendar.getInstance();
            int currentYear =  calender.get(Calendar.YEAR);
            int length = currentYear - 2000;
            int selectedYearInInteger = 0;
            for(int a = 1;a<=length;a++){
                if(a == selectedYearIndex){
                    selectedYearInInteger = Integer.parseInt(selectedYear);
                }

            }
            int[] daysNumberInMonths = new int[13];
            if (((selectedYearInInteger % 4 == 0) && (selectedYearInInteger % 100!= 0)) || (selectedYearInInteger%400 == 0)){
                int[] daysNumberInMonthsLeapYear = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
                System.arraycopy(daysNumberInMonthsLeapYear, 0, daysNumberInMonths, 0, 13);
            }
            else{
                int[] daysNumberInMonthsNotLeapYear = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
                System.arraycopy(daysNumberInMonthsNotLeapYear, 0, daysNumberInMonths, 0, 13);
            }
            String[] months = new String[13];
            months = getMonths();

            int selectedMonth = buyWindowPurchaseDateMonth.getSelectedIndex();

            for(int i = 1; i<=13;i++){
                if(selectedMonth == i){
                    String[] days = new String[daysNumberInMonths[i]+1];
                    days[0] = "Day";
                    for(int j=1;j<=daysNumberInMonths[i];j++){
                        days[j] = Integer.toString(j);
                    }

                    buyWindowPurchaseDateDay.setModel(new DefaultComboBoxModel<String>(days));
                }
            }

        }
        //============================================================\\

        //this calls the buyElectricCar method from the Electric Car class//
        if(e.getSource() == buyWindowBuyButton){
            if(buyWindowCarIdText.getText() == "" || buyWindowCarNameText.getText() == "" || buyWindowCarBrandText.getText() == "" || buyWindowCarColorText.getText()== "" || buyWindowBatteryWarrantyText.getText() == "" || buyWindowRangeText.getText() =="" || buyWindowRechargeTimeText.getText() =="" ||
            buyWindowCarPriceText.getText() =="" || buyWindowCustomerNameText.getText() == "" ||
            buyWindowPurchaseDateYear.getSelectedItem() == "Year" || buyWindowPurchaseDateMonth.getSelectedItem() == "Month" || 
            buyWindowPurchaseDateDay.getSelectedItem() == "Day"){
                JOptionPane.showMessageDialog(frame, "Some fields have not been entered or selected");
            }
            else{
                try{

                    int carId = Integer.parseInt(buyWindowCarIdText.getText());
                    String carName = buyWindowCarNameText.getText();
                    String carBrand = buyWindowCarBrandText.getText();
                    String carColor = buyWindowCarColorText.getText();
                    String customerName = buyWindowCustomerNameText.getText();
                    int batteryWarranty = Integer.parseInt(buyWindowBatteryWarrantyText.getText());
                    String range = buyWindowRangeText.getText();
                    int rechargeTime = Integer.parseInt(buyWindowRechargeTimeText.getText());
                    String carPrice = buyWindowCarPriceText.getText();
                    String purchaseDate = buyWindowPurchaseDateYear.getSelectedItem().toString() + buyWindowPurchaseDateMonth.getSelectedItem().toString()
                        + buyWindowPurchaseDateDay.getSelectedItem().toString();
                    boolean isThereCar = false;
                    if(cars.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "There is no Car. Please add a Car");
                    }
                    else{

                        for(Car car:cars){
                            if(car.getCarId() == carId && car instanceof ElectricCar){

                                ElectricCar electricCar = (ElectricCar)car;
                                if(electricCar.getIsBought() == true){

                                    JOptionPane.showMessageDialog(frame, "Car has already been bought");

                                }
                                else{

                                    JOptionPane.showMessageDialog(frame, "Car has now been bought");
                                }
                                electricCar.buyElectricCar(customerName, batteryWarranty,purchaseDate,range,rechargeTime);
                                isThereCar = false;
                                break;
                            }
                            else{
                                isThereCar = true;
                                
                            }
                            
                        }
                        if(isThereCar == true){
                                JOptionPane.showMessageDialog(frame, "There is no Car of this Car Id in electricCar. Please enter the correct CarId");
                            }
                    }

                }

                catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "You have entered some invalid information in Car Id/Battery Warranty/Recharge Time . Please enter correct information in these sections");
                }
            }
        }
        //=================================================//
        //**************************************************************\\
        //*************************Sell Window***************************\\
        //shows the mainWindow panel and hides the sell window panel//
        if(e.getSource() == sellWindowMainButton){
            cardLayout.show(mainPanel, "mainwindow");
        }
        //========================================================//

        //======this method calls the sellElectricCar from the Electric Car class====//
        if(e.getSource() == sellWindowSellButton){
            if(sellWindowCarIdText.getText() == "" || sellWindowCustomerNameText.getText() == ""){
                JOptionPane.showMessageDialog(frame, "Some fields have not been entered or selected");
            }
            else{
                try{

                    int carId = Integer.parseInt(sellWindowCarIdText.getText());
                    String customerName = sellWindowCustomerNameText.getText();
                    if(cars.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "There is no Car. Please add a Car");
                    }
                    else{
                        boolean isThereCar = false;
                        for(Car car:cars){
                            if(car.getCarId() == carId && car instanceof ElectricCar){

                                ElectricCar electricCar = (ElectricCar)car;
                                if(electricCar.getIsSold() == true){
                                    JOptionPane.showMessageDialog(frame, "Car has already been Sold");

                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "This car is now sold");
                                }
                                electricCar.sellElectricCar(customerName);
                                isThereCar = false;
                                break;

                            }

                        }
                        if(isThereCar == true){
                            JOptionPane.showMessageDialog(frame, "There is no Car of this Car Id which is electricCar. Please enter the correct CarId");
                        }
                    }
                }

                catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "You have entered some invalid information in Car Id Field . Please enter correct information in this section");
                }
            }
        }
        //============================================================//
        //**************************************************************\\
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\

    }

    //this method returns all the year till 2000
    public String[] getYears(){
        Calendar calender = Calendar.getInstance();
        int currentYear =  calender.get(Calendar.YEAR);
        int length = currentYear - 2000;
        String[] years = new String[length+2];
        for(int i = 0; i<=length+1;i++){
            years[i] = Integer.toString((currentYear+1) - i);
        }

        years[0] = "Year";
        return years;
    }

    //this method returns all the names of months
    public String[] getMonths(){
        String months[] = new String[] {"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
        return months;
    }

    public static void main(String[] args){
        new GUI_Demo(); 
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.SwitchableLight;

public class Team4008HM2024 {
    //public DcMotor DriveRightBack = null;
    //public DcMotor DriveLeftBack = null;
    public DcMotor DriveLeftFront = null;
    public DcMotor DriveRightFront = null;

    public DcMotor armMotor = null;
    public DcMotor armMotor2 = null;
//
  //  public CRServo intakeL = null;
//
    //public CRServo intakeR = null;
    /*public DcMotor Turret = null;
    public DcMotor Elevator = null;

    public DcMotor Arm = null;

    public Servo IntakeLeft = null;

    public NormalizedColorSensor ColorSensor = null;*/



    //public ElapsedTime period  = new ElapsedTime();

    // public Team4008HMNew() {}

    HardwareMap hwMap = null;
    //FIX AND USE IT
    public void Map(HardwareMap hardwareMap)
    {
        hwMap = hardwareMap;
        DriveLeftFront = hwMap.get(DcMotor.class,"DriveLeftFront");
        DriveRightFront = hwMap.get(DcMotor.class,"DriveRightFront");

        armMotor = hwMap.get(DcMotor.class,"armMotor");
        armMotor2 = hwMap.get(DcMotor.class,"armMotor2");
       // DriveLeftBack = hwMap.get(DcMotor.class,"DriveLeftBack");
       // DriveRightBack = hwMap.get(DcMotor.class,"DriveRightBack");
        //   Lights = hwMap.get(RevBlinkinLedDriver.class,"Lights");
        DriveLeftFront.setDirection(DcMotor.Direction.FORWARD);
        DriveLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveLeftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DriveRightFront.setDirection(DcMotor.Direction.REVERSE);
        DriveRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveRightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        armMotor.setDirection(DcMotor.Direction.FORWARD);
        armMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        armMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        armMotor2.setDirection(DcMotor.Direction.REVERSE);
        armMotor2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        armMotor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

//        intakeL = hwMap.get(CRServo.class, "intakeL");
//        intakeR = hwMap.get(CRServo.class, "intakeR");

       /* DriveLeftBack.setDirection(DcMotor.Direction.FORWARD);
        DriveLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveLeftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DriveRightBack.setDirection(DcMotor.Direction.REVERSE);
        DriveRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveRightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        Turret = hwMap.get(DcMotor.class,"Turret");
        Turret.setDirection(DcMotorSimple.Direction.REVERSE);
        Turret.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //IntakeLift.setDirection(DcMotor.Direction.REVERSE);

        Elevator = hwMap.get(DcMotor.class, "Elevator");
        Elevator.setDirection(DcMotorSimple.Direction.REVERSE);
        Elevator.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Elevator.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        IntakeLeft = hwMap.get(Servo.class, "Servo1");

        Arm = hwMap.get(DcMotor.class, "Arm");
gfg
        ColorSensor = hwMap.get(NormalizedColorSensor.class, "sensor");*/

    }
}

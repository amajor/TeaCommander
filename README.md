# Tea Commander

This is a tea control system that demonstrates the Command Pattern.

## Command Pattern Definition

> **The Command Pattern** encapsulates a request as an object, thereby letting
> you parameterize the other objects with different requests, queue, or log
> requests, and support undoable operations.

## This Project

**ElectricKettle** is our tool that can turn on and off, as well as set
different temperatures to heat to.

**TeaLeafDispenser** can choose which tea leaf to dispense and how much
to measure out.

**TeaControl** is a system of buttons that can be pressed to prep water and
tea leaves for different types and amounts of tea.

To see the classes in action, we can run the different JUnit test files.
Specifically, `TeaControlTest` will run the test for the main control.

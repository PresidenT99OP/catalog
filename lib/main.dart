import 'package:flutter/material.dart';
 
void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {

    int day = 10;
    String name = "nishant";

    return MaterialApp(
      home: Material(
        child:Center(
          child: Container(
        child: Text("Nishant kumar $name"),
        ) 
      )
      ) ,
    );
  }
}

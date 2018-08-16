import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { AlertController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  texto : any;
  textoLabelPrompt : string;
  

  constructor(public navCtrl: NavController,
              public alertCtrl : AlertController) {

  }


  //Ejercicio 1
  mostrarAlert(){

    let texto = this.texto;
    let alert = this.alertCtrl.create({
      title:'Título del cuadro',
      message:'El texto ingresado fue: ' + texto,
      buttons:['Aceptar']
    });
    alert.present()
  }

  mostrarPromptAlert(){

    let alertPrompt = this.alertCtrl.create({
      title: 'Título alert prompt',
      message: 'Ingrese un texto:',
      inputs:[
        {
          name: 'textoPrompt',
          placeholder:'texto',
          
        }
      ],
      buttons:[
        {
          text: 'Aceptar',
          handler: data =>{
            console.log(data.textoPrompt);
            this.textoLabelPrompt = data.textoPrompt;
          }
      }
    ]
    });
    
    alertPrompt.present()
  }




}

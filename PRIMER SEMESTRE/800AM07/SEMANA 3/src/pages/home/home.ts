import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { SegundaPage } from '../segunda/segunda';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  texto : any;

  constructor(public navCtrl: NavController) {

  }

  mostrarTextoEnToolbar(){

    let texto = this.texto;
    return texto;
  }

  abrirSegundaPagina(){

    this.navCtrl.push(SegundaPage)

  }


}

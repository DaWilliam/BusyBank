import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  constructor() { }

  ngOnInit() {

  }
  onAccept(form){
    console.log(form.email);
    console.log(form.password);
  }
}

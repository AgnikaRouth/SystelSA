import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Fan } from '../fan';
import { FanService } from '../fan.service';

@Component({
  selector: 'app-create-fan',
  templateUrl: './create-fan.component.html',
  styleUrls: ['./create-fan.component.css']
})
export class CreateFanComponent implements OnInit {

  fan: Fan = new Fan();
  constructor(private fanService: FanService, private router: Router) { }

  ngOnInit(): void {
  }

 

  saveFan(){
    this.fanService.addFantoRemote(this.fan).subscribe
    ( data =>{
      console.log(data);
      this.router.navigate(['/addFan']);
    },
    error => console.log(error)
    );
  }

  goToFanList(){
    this.router.navigate(['/fanlist']);
  }

  onSubmit()
  {
    console.log(this.fan);
    this.saveFan();
  }
}

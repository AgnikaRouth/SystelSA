import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Fan } from '../fan';
import { FanService } from '../fan.service';

@Component({
  selector: 'app-fan-list',
  templateUrl: './fan-list.component.html',
  styleUrls: ['./fan-list.component.css']
})
export class FanListComponent implements OnInit {

  fans:Fan[]; //use the properties of Fan class

  constructor(private fanService: FanService, private router: Router) { }

  ngOnInit(): void {

    this.getFans();
  }

  private getFans()
  {
    this.fanService.fetchFanListFromRemote().subscribe
    (
      data =>
      {
          console.log("Response for Fan Received");
          this.fans = data;
      },
      error => console.log("Exception Occured")
      );
  }

  updateFan(id: number){
    this.router.navigate(['updateFan', id]);
  }

  deleteFan(id: number){
    this.fanService.deleteFanFromRemote(id).subscribe( data => {
      console.log(data);
      this.getFans();
    })
  }

}

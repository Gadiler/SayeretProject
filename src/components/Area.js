import React from 'react';
import Point from "./Point";
import json from "../sayeret data.json";

// To do - create for loop to get all points of a specific area
class Area extends React.Component{
    getAreaPoints () {
        const points = [];
        //let pointsFile = this.getDataFromServer(1);
        for (let i = 0; i < json.money.length; i++) {
            // get current area
            points[i] = json.money[i];
        }
        return points;
    }
/*
    getDataFromServer(i) {
    let xhttp, data;
    xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            data = JSON.parse(this.responseText);
        }
    }
    xhttp.open("GET", /getAllPoints, true);
    xhttp.send();
    return data;
}
*/
    render()
    {
        //let areas = this.getAreaPoints()
        //console.log(areas[0].name)
        
        const name = "0";
        const url = "0";
        return <div className="area">
            <h1>{this.props.name}</h1>
            <Point name={name} url={url}></Point>
        </div>
    }
};

export default Area;

/*
        let name = data[1];
            let area = data[2];
            let imagePath = data[3];
         */

        /*const data = getDataFromServer();
        for(let i = 0; i < data.length; i++) {
            out += '<a href="' + arr[i].url + '">' +
            arr[i].display + '</a><br>';
        }



// Get all points data from server by http request
/*
*/

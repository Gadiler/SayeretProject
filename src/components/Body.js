import React from 'react';
import Area from "./Area";
import map from "../icons/map.jpg";
//import json from "../sayeret data.json";

// To do - change map to mapbox element
class Body extends React.Component{

    render() {

        return <div className="body">

            <span className="rightSide">
                <Area name="רמת הגולן"></Area>
                <Area name="אצבע הגליל"></Area>
                <Area name="גליל עליון"></Area>

                <Area name="גליל מערבי"></Area>
                <Area name="גליל תחתון"></Area>
                <Area name="עמק יזרעאל"></Area>

                <Area name="הכרמל"></Area>
                <Area name="עמק הירדן ובקעת בית שאן"></Area>
                <Area name="השומרון"></Area>

                <Area name="השרון"></Area>
                <Area name="בקעת הירדן"></Area>
                <Area name="מדבר יהודה"></Area>

                <Area name="הרי יהודה"></Area>
                <Area name="שפלת יהודה"></Area>
                <Area name="מישור החוף"></Area>

                <Area name="נגב"></Area>
                <Area name="ערבה"></Area>
            </span>

            <span className="leftSide">
                <img src={map} alt="map" width="500" height="600"/>
            </span>
        </div>
    }
};

export default Body;

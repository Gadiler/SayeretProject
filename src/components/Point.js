import React from 'react';

// To do -
// 1. accept the data from a query to the DB
// 2. add link to relevant photos

class Point extends React.Component{
    render(){
        return <div className="point">
                    <span>{this.props.name} &nbsp; &nbsp; &nbsp; &nbsp;</span>
                    <a href={this.props.url}>תמונה</a>
                </div>
    }
};

export default Point;

const { Server } = require('ws');
 
const sockserver = new Server({ port: 443 });
const connections = new Set();
sockserver.on('connection', (ws) => {
	console.log('New client connected!'); 
	ws.on('close', () => console.log('Client has disconnected!'));
	connections.add(ws)
	ws.on('message', (data) => {
       //const message = JSON.parse(data);
       connections.forEach((client) => {
           client.send(data);
       })
	});
   
   
});


var sent = '0';
/*setInterval(() => {
   sockserver.clients.forEach((client) => {
       const data = JSON.stringify({'type': 'time', 'time': new Date().toTimeString()});
       client.send('0');
   });
}, 1000);*/
 
/*setInterval(() => {
   sockserver.clients.forEach((client) => {
       //const messages = ['Hello', 'What do you ponder?', 'Thank you for your time', 'Be Mindful', 'Thank You'];
       //const random = Math.floor(Math.random() * messages.length);
       //let position = {x: Math.floor(Math.random() * 200), y: Math.floor(Math.random() * 150)}
       //const data = JSON.stringify({'type': 'message', 'message': messages[random], 'position': position});
       if(sent === '0'){
		sent = '1';
	   }else{
		sent = '0'
	   }
	   client.send(sent);
   });
}, 1000);*/

var fs = require('fs'); 
var parse = require('csv-parse');
var parser = parse({columns: true}, function (err, records) {
	console.log(records);
});

fs.createReadStream(__dirname+'/chart-of-accounts.csv').pipe(parser);
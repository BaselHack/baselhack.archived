import net.sf.json.groovy.JsonSlurper
String url = 'https://www.baselhack.ch/nova-api/participants?search=&filters=&orderBy=Lastname&orderByDirection=asc&perPage=999&trashed=&page=1&viaResource=&viaResourceId=&viaRelationship=&relationshipType='
// TODO Read from website
String csv = "Company;First Name;Last Name\n"
def notNull(v) {v == 'null' ? '' : v}
new JsonSlurper().parse(new File('baselhack participants.json')).resources.each { 	
	csv += "${notNull(it.fields.'0'.value)};${notNull(it.fields.'1'.value)};${notNull(it.fields.'2'.value)}\n"
}
println csv
new File('baselhack participants.csv').setText(csv, 'UTF-8')
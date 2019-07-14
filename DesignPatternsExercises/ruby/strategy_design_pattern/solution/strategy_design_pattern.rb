require_relative 'csv_data_type'
require_relative 'db_data_type'
require_relative 'tsv_data_type'

puts 'Extraction tool for CSV file:'
data = CSVDataType.new
data.extract_data

puts "\nExtraction tool for DB file:"
data = DBDataType.new
data.extract_data

puts "\nExtraction tool for TSV file:"
data = TSVDataType.new
data.extract_data

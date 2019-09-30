INSERT INTO activity(id, begin, client_ip, counter, last, session_id) VALUES('1','2019-09-15', '192.168.1.1','1','2019-09-16','session1');
INSERT INTO activity(id, begin, client_ip, counter, last, session_id) VALUES('2','2019-09-15', '192.168.1.1','2','2019-09-16','session2');
INSERT INTO activity(id, begin, client_ip, counter, last, session_id) VALUES('3','2019-09-15', '192.168.1.1','2','2019-09-16','session3');
INSERT INTO activity(id, begin, client_ip, counter, last, session_id) VALUES('4','2019-09-15', '192.168.1.1','2','2019-09-16','session4');

INSERT INTO route(id, domain, host_ip, host_name, path , time_stamp, activity_id) VALUES ('1','http://www.onet.pl','192.168.0.1', 'server', 'security', '2018-09-17','1');
INSERT INTO route(id, domain, host_ip, host_name, path , time_stamp, activity_id) VALUES ('2','http://www.onet.pl','192.168.0.1', 'server', 'security', '2018-09-16','2');
INSERT INTO route(id, domain, host_ip, host_name, path , time_stamp, activity_id) VALUES ('3','http://www.onet.pl','192.168.0.1', 'server', 'security', '2018-09-15','4');
INSERT INTO route(id, domain, host_ip, host_name, path , time_stamp, activity_id) VALUES ('4','http://www.onet.pl','192.168.0.1', 'server', 'security', '2018-09-14','4');

